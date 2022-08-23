package oop;

public class Car {

    //Fields
    private String colour;
    private String brand;
    private int maxSpeed;

    //basics.Methods

   //setter methods
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
//getter methods
    public  String getColour(){
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Maximum speed: " + maxSpeed);
    }
}
