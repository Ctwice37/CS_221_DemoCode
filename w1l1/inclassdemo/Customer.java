package w1l1.inclassdemo;

public class Customer extends SimplePerson {


    int id;

    public Customer (){

    }

    public Customer (int id){
        this.id = id;
    }

    @Override
    public void printInfo(){
        // this prints all info
        // add cuts ID
    }

    @Override
    public String toString(){
        return "";
    }

    public static void main (){
        Customer c = new Customer();
        Customer c2 = new Customer(111);



    }
}
