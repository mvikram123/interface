//Notes on Interfaces:
//  Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
//  Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//  Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)
//   Why And When To Use Interfaces?
//  1) To achieve security - hide certain details and only show the important details of an object (interface).
//
// 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).



 interface Bike{
    void run();
}
 interface BMW{
    void stop();

        }
        class Vehicle implements Bike,BMW{
        String color="red";
       public void run()        //override the method of interface Bike
        {
            System.out.println("Bike is running");
        }
      public  void stop()           //override the method of interface BMW
        {
            System.out.println("car is not running");
        }
        }

public class Main {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();

        System.out.println("color:"+v1.color);
        v1.run();
        v1.stop();
    }
}