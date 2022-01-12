/*<listing chapter="6" section="4">*/
package w3l6;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class to represent a binary search tree.
 * @author Koffman and Wolfgang
 */

class Node<E> {
    // Data Fields

    /** The information stored in this node. */
    public E data;
    /** Reference to the left child. */
    public Node<E> left;
    /** Reference to the right child. */
    public Node<E> right;

    // Constructors
    /**
     * Construct a node with given data and no children.
     * @param data The data to store in this node
     */
    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    // Methods
    /**
     * Returns a string representation of the node.
     * @return A string representation of the data fields
     */
    @Override
    public String toString() {
        return data.toString();
    }
}

public class BinarySearchTree<E extends Comparable<E>>
                implements SearchTree<E> {
    // Data Fields

    /** Return value from the public add method. */
    protected boolean inserted;
    /** Return value from the public delete method. */
    protected E deleteReturn;

    Node<E> root;

    /** Construct an empty BinaryTree */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree with a specified root.
     * Should only be used by subclasses.
     * @param root The node that is the root of the tree.
     */
     BinarySearchTree(Node<E> root) {
        this.root = root;
    }

    
    //Methods
    /*<listing chapter="6" number="3">*/
    /**
     * Starter method find.
     * @pre The target object must implement
     *      the Comparable interface.
     * @param target The Comparable object being sought
     * @return The object, if found, otherwise null
     */
    @Override
    public E find(E target) {
        return find(root, target);
    }

    /**
     * Recursive find method.
     * @param localRoot The local subtree�s root
     * @param target The object being sought
     * @return The object, if found, otherwise null
     */
    private E find(Node<E> localRoot, E target) {
        if (localRoot == null) {
            return null;
        }

        // Compare the target with the data field at the root.
        int compResult = target.compareTo(localRoot.data);
        if (compResult == 0) {
            return localRoot.data;
        } else if (compResult < 0) {
            return find(localRoot.left, target);
        } else {
            return find(localRoot.right, target);
        }
    }
    /*</listing>*/

    /*<listing chapter="6" number="4">*/
    /**
     * Starter method add.
     * @pre The object to insert must implement the
     *      Comparable interface.
     * @param item The object being inserted
     * @return true if the object is inserted, false
     *         if the object already exists in the tree
     */
    @Override
    public boolean add(E item) {
        root = add(root, item);
        return inserted;
    }

    /**
     * Recursive add method.
     * @post The data field inserted is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private Node<E> add(Node<E> localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree insert it.
            inserted = true;
            return new Node<E>(item);
        } else if (item.compareTo(localRoot.data) == 0) {
            // item is equal to localRoot.data
            inserted = false;
            return localRoot;
        } else if (item.compareTo(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
    /*</listing>*/

    /*<listing chapter="6" number="5">*/
    /**
     * Starter method delete.
     * @post The object is not in the tree.
     * @param target The object to be deleted
     * @return The object deleted from the tree
     *         or null if the object was not in the tree
     * @throws ClassCastException if target does not implement
     *         Comparable
     */
    public E delete(E target) {
        root = delete(root, target);
        return deleteReturn;
    }
   
    public E getRoot(){
    	return (E) root.toString();
    }
    /**
     * Recursive delete method.
     * @post The item is not in the tree;
     *       deleteReturn is equal to the deleted item
     *       as it was stored in the tree or null
     *       if the item was not found.
     * @param localRoot The root of the current subtree
     * @param item The item to be deleted
     * @return The modified local root that does not contain
     *         the item
     */
    private Node<E> delete(Node<E> localRoot, E item) {
    	// Case - If the Root is Empty - Base Case - I
        if (localRoot == null) {
            // item is not in the tree.
            deleteReturn = null;
            return localRoot;
        }

        // Search for item to delete.
        int compResult = item.compareTo(localRoot.data);
        if (compResult < 0) {
            // item is smaller than localRoot.data. Do the recursive search on the left side
            localRoot.left = delete(localRoot.left, item);
            return localRoot;
        } else if (compResult > 0) {
            // item is larger than localRoot.data. Do the recursive search on the right side
            localRoot.right = delete(localRoot.right, item);
            return localRoot;
        } else {
            // item is found at local root.  Base Case - II
            deleteReturn = localRoot.data;
            if (localRoot.left == null) { // Case 1 - leaf node
                // If there is no left child, return right child
                // which can also be null.
                return localRoot.right;
            } else if (localRoot.right == null) {
                // If there is no right child, return left child.
                return localRoot.left;
            } else {
                // Node being deleted has 2 children, replace the data
                // with inorder predecessor.
                if (localRoot.left.right == null) {
                    // The left child has no right child.
                    // Replace the data with the data in the
                    // left child.
                    localRoot.data = localRoot.left.data;
                    // Replace the left child with its left child.
                    localRoot.left = localRoot.left.left;
                    return localRoot;
                } else {
                    // Search for the inorder predecessor (ip) and
                    // replace deleted node's data with ip.
                    localRoot.data = findPredessor(localRoot.left);
                    return localRoot;
                }
            }
        }
    }
    /*</listing>*/

    /*<exercise chapter="6" section="4" type="programming" number="1">*/
    /**
     * Removes target from tree.
     * @param target Item to be removed
     * @return true if the object was in the tree, false otherwise
     * @post target is not in the tree
     * @throws ClassCastException if target is not Comparable
     */
    public boolean remove(E target) {
        return delete(target) != null;
    }

    /**
     * Determine if an item is in the tree
     * @param target Item being sought in tree
     * @return true If the item is in the tree, false otherwise
     * @throws ClassCastException if target is not Comparable
     */
    public boolean contains(E target) {
        return find(target) != null;
    }
    /*</exercise>*/

    /*<listing chapter="6" number="6">*/
    /**
     * Find the node that is the
     * inorder predecessor and replace it
     * with its left child (if any).
     * @post The inorder predecessor is removed from the tree.
     * @param parent The parent of possible inorder
     *        predecessor (ip)
     * @return The data in the ip
     */
    private E findPredessor(Node<E> parent) {
        // If the right child has no right child, it is
        // the inorder predecessor.
        if (parent.right.right == null) {
            E returnValue = parent.right.data;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findPredessor(parent.right);
        }
    }
    /*</listing>*/

    /*<exercise chapter="6" section="4" type="programming" number="2">*/
    /** 
     * Starter method deletePrime. deletePrime is the same as delete
     * except that when a value is deleted that has two children
     * the inorder sucessor replaces it in the tree.
     * @post The object is not in the tree.
     * @param target The object to be deleted
     * @return The object deleted from the tree
     *         or null if the object was not in the tree
     * @throws ClassCastException if target does not implement
     *         Comparable
     */
    public E deletePrime(E target) {
        root = deletePrime(root, target);
        return deleteReturn;
    }

    /** Recursive deletePrime method.
     * @post The item is not in the tree;
     *       deleteReturn is equal to the deleted item
     *       as it was stored in the tree or null
     *       if the item was not found.
     * @param localRoot The root of the current subtree
     * @param item The item to be deleted
     * @return The modified local root that does not contain
     *         the item
     */
    
    // Deletion - Replace with In-order Successor
    private Node<E> deletePrime(Node<E> localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree.
            deleteReturn = null;
            return localRoot;
        }

        // Search for item to delete.
        int compResult = item.compareTo(localRoot.data);
        if (compResult < 0) {
            // item is smaller than localRoot.data. Keep search on left, if not found return null
            localRoot.left = deletePrime(localRoot.left, item);
            return localRoot;
        } else if (compResult > 0) {
            // item is larger than localRoot.data.
            localRoot.right = deletePrime(localRoot.right, item);
            return localRoot;
        } else {
            // item is at local root and it has no children(leaf)
            deleteReturn = localRoot.data;
            // Set the parent of the local root to reference that child
            if (localRoot.left == null && localRoot.right == null) {
                // Case  - I If there is no left child and no right child
                localRoot.data = null;   
            	return localRoot;
            }  else {
                // Case 2 & Case 3 Node being deleted has 1 child or 2 children
            	// replace the data with inorder successor.
                if (localRoot.right.left == null) {
                    // The right child has no left child.
                    // Replace the data with the data in the
                    // right child.
                    localRoot.data = localRoot.right.data;
                    // Replace the right child with its right child.
                    localRoot.right = localRoot.right.right;
                    return localRoot;
                } else {
                    // Search for the inorder predessor (is) and
                    // replace deleted node's data with is.
                    localRoot.data = findPredessor(localRoot.left);
                    return localRoot;
                }
            }
        }
    }

    /**
     * Find the node that is the
     * inorder sucessor and replace it
     * with its right child (if any).
     * @post The inorder sucessor is removed from the tree.
     * @param parent The parent of possible inorder
     *        sucessor (is)
     * @return The data in the is
     */
    private E findSuccessor(Node<E> parent) {
        // If the left child has no left child, it is
        // the inorder sucessor.
        if (parent.left.left == null) {
            E returnValue = parent.left.data;
            parent.left = parent.left.right;
            return returnValue;
        } else {
            return findSuccessor(parent.left);
        }
    }
    /*</exercise>*/

    
    /*<exercise chapter="6" section="4" type="programming" number="3">*/
    /**
     * Return the contents of the BinarySearchTree as a List of items
     * in ascending order. (Note the exercise suggests returning a string
     * of item separated by newline characters, but a List is more general
     * and useful for the testing performed by the exercise.  Also, the
     * toString method of the BinaryTree class would be hidden and it is
     * useful to verify some of the tests.
     */
    public List<E> toList() {
        List<E> result = new ArrayList<E>();
        toList(result, root);
        return result;
    }

    // Inorder Traversal to print the values
    private void toList(List<E> result, Node<E> node) {
        if (node == null) {
            return;
        }
        toList(result, node.left);
        result.add(node.data);
        toList(result, node.right);
    }
    
    public void inOrder()
    {
    	inOrder(root);
    }
    private void inOrder(Node<E> node) {
        if (node == null) {
            return;
        }
        inOrder( node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    
    
     
    /*</exercise>*/
    public static void main(String args[]){
    	List<Integer> list = Arrays.asList(56,46,36,66,50, 32,60, 70, 55, 59,72,69);
    	BinarySearchTree<Integer> bst = new BinarySearchTree();
    	for(int i=0;i<list.size();i++)
    		bst.add(list.get(i));
    	 System.out.println(bst.getRoot());
    	 System.out.println("List of Items in a Sorted Order : " + bst.toList());
    	
      System.out.println("Deleted : "+bst.delete(36));
       System.out.println("Deleted : "+bst.delete(59));
       System.out.println("Root : " + bst.getRoot());
       System.out.println("List of Items in a Sorted Order : " + bst.toList());
       System.out.println("Finding of 46 :" + bst.find(46));
       System.out.println("Finding of 46 :" + bst.contains(46));
       System.out.println("Finding of 100 :" + bst.find(100));
       System.out.println("In order Traversal Result : ");
       bst.inOrder();
       
    }
   
}
/*</listing>*/
