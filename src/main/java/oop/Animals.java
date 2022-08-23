package oop;

public class Animals {

    //Fields

    private String type;
    private String breed;
    private float weight;
    private int avgLifespan;

    //Custom constructor
    public Animals(String type, String breed, float weight, int avgLifespan){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
        this.avgLifespan = avgLifespan;
    }

    public Animals(String type, String breed, float weight){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
    }
    public Animals(){

    }
    public void setAvgLifespan(int avgLifespan){
        this.avgLifespan = avgLifespan;
    }

    public void printAnimalInfo(){
        System.out.println("Type " + type);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Avarage lifespan: " + avgLifespan + " years");
    }

}
