package oop;

public class CallingAnimal {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Cat", "Main coon", 10.4f, 14);
        animal1.printAnimalInfo();

        Animals animal2 = new Animals("Dog","Toy Poodle", 3.1f);
        animal2.printAnimalInfo();
        //animal2.printavgLifespan(20);
    }
}
