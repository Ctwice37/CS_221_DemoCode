package w4l7;

// demonstrates hash table with double hashing
// to run this program: C:>java HashDoubleApp
import java.io.*;
////////////////////////////////////////////////////////////////
class DItem
   {                                 // (could have more items)
   private int iData;                // data item (key)
//--------------------------------------------------------------
   public DItem(int ii)           // constructor
      { iData = ii; }
//--------------------------------------------------------------
   public int getKey()
      { return iData; }
//--------------------------------------------------------------
   }  // end class DItem
////////////////////////////////////////////////////////////////
class DHTable
   {
   private DItem[] hashArray;     // array is the hash table
   private int arraySize;
   private DItem nonItem;         // for deleted items
// -------------------------------------------------------------
   DHTable(int size)               // constructor
      {
      arraySize = size;
      hashArray = new DItem[arraySize];
      nonItem = new DItem(-1);
      }
// -------------------------------------------------------------
   public void displayTable()
      {
      System.out.print("Table: ");
      for(int j=0; j<arraySize; j++)
         {
         if(hashArray[j] != null)
            System.out.print(hashArray[j].getKey()+ " ");
         else
            System.out.print("** ");
         }
      System.out.println("");
      }
// -------------------------------------------------------------
   public int hashFunc1(int key)
      {
	  int k =  key % arraySize;
	  System.out.println("Index : " + k);
      return k;
      }
// -------------------------------------------------------------
   public int hashFunc2(int key)
      {
      // non-zero, less than array size, different from hF1
      // array size must be relatively prime to 5, 4, 3, and 2
	   
	   int s = 5 - key % 5;
	   System.out.println("Step Size : " +s);
      return s;
      }
// -------------------------------------------------------------
                                     // insert a DItem
   public void insert(int key, DItem item)
   // (assumes table not full)
      {
      int hashVal = hashFunc1(key);  // hash the key
      int stepSize = hashFunc2(key); // get step size
                                     // until empty cell or -1
      while(hashArray[hashVal] != null &&
                      hashArray[hashVal].getKey() != -1)
         {
    	   hashVal = (hashVal+stepSize)%arraySize;        // add the step
    	   System.out.println("Find the vacant in index : " + hashVal);
           
         }
      hashArray[hashVal] = item;     // insert item
      }  // end insert()
// -------------------------------------------------------------
   public DItem delete(int key)   // delete a DataItem
      {
      int hashVal = hashFunc1(key);      // hash the key
      int stepSize = hashFunc2(key);     // get step size

      while(hashArray[hashVal] != null)  // until empty cell,
         {                               // is correct hashVal?
         if(hashArray[hashVal].getKey() == key)
            {
            DItem temp = hashArray[hashVal]; // save item
            hashArray[hashVal] = nonItem;       // delete item
            return temp;                        // return item
            }
         hashVal = (hashVal+stepSize)%arraySize; 
         }
      return null;                   // can't find item
      }  // end delete()
// -------------------------------------------------------------
   public DItem find(int key)     // find item with key
   // (assumes table not full)
      {
      int hashVal = hashFunc1(key);      // hash the key
      int stepSize = hashFunc2(key);     // get step size

      while(hashArray[hashVal] != null)  // until empty cell,
         {                               // is correct hashVal?
         if(hashArray[hashVal].getKey() == key)
            return hashArray[hashVal];   // yes, return item
         hashVal = (hashVal+stepSize)%arraySize; 
         }
      return null;                   // can't find item
      }
// -------------------------------------------------------------
   }  // end class HashTable
////////////////////////////////////////////////////////////////
class HashDoubleApp
   {
   public static void main(String[] args) throws IOException
      {
      int aKey;
      DItem aDataItem;
      int size, n;
                                  // get sizes
      System.out.print("Enter size of hash table: ");
      size = getInt();
      System.out.print("Enter initial number of items: ");
      n = getInt();
                                  // make table
      DHTable theHashTable = new DHTable(size);

      for(int j=0; j<n; j++)      // insert data
         {
         aKey = (int)(java.lang.Math.random() * 2 * size);
         aDataItem = new DItem(aKey);
         theHashTable.insert(aKey, aDataItem);
         }

      while(true)                 // interact with user
         {
         System.out.print("Enter first letter of ");
         System.out.print("show, insert, delete, or find: ");
         char choice = getChar();
         switch(choice)
            {
            case 's':
               theHashTable.displayTable();
               break;
            case 'i':
               System.out.print("Enter key value to insert: ");
               aKey = getInt();
               aDataItem = new DItem(aKey);
               theHashTable.insert(aKey, aDataItem);
               break;
            case 'd':
               System.out.print("Enter key value to delete: ");
               aKey = getInt();
               theHashTable.delete(aKey);
               break;
            case 'f':
               System.out.print("Enter key value to find: ");
               aKey = getInt();
               aDataItem = theHashTable.find(aKey);
               if(aDataItem != null)
                  System.out.println("Found " + aKey);
               else
                  System.out.println("Could not find " + aKey);
               break;
            default:
               System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
//--------------------------------------------------------------
   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
//--------------------------------------------------------------
   public static char getChar() throws IOException
      {
      String s = getString();
      return s.charAt(0);
      }
//-------------------------------------------------------------
   public static int getInt() throws IOException
      {
      String s = getString();
      return Integer.parseInt(s);
      }
//--------------------------------------------------------------
   }  // end class HashDoubleApp
////////////////////////////////////////////////////////////////
