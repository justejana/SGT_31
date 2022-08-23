package oop;

public class CallingCarClass {
    public static void main(String[] args) {
        //Crate new object from car class template
        //Set field values
        //Call printCarInfo method to check field values

        Car car1 = new Car();
        //car1.brand ="BMW";
       // car1.maxSpeed = 208;
        //car1.colour = "Black";
        car1.setColour("Black");
        car1.setBrand("Audi");
        car1.setMaxSpeed(200);

        car1.printCarInfo();

        //Acces individual fields
        //System.out.println("Max speed is " + car1.maxSpeed);
        System.out.println("Car's colour is " + car1.getColour());
        System.out.println("Max speed is " + car1.getMaxSpeed());
    }
}
