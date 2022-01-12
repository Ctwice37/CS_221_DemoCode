package w1l1.inclassdemo.mytest;

import w1l1.inclassdemo.Person;
import java.util.ArrayList;
import java.util.List;

public class Tester {


  public static void main(String [] args){

      Integer x = 5;

      Person p1 = new Person("Dean","male");
      Person p2 = new Person("Zaineh","female");

      List<Person> people = new ArrayList<>();

      
      people.add(p1);
      people.add(p2);

      System.out.println(people);
  }



}
