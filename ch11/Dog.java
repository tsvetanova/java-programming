package ch11;

public class Dog extends Pets{

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setColor(String name){
        this.name = color;
    }

    String getColor(){
        return this.color;
    }

    public Dog(){
        this.name = "Pesho";
        this.color = "white";
    }

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    private static void makeBau(){
        System.out.println("Bauuuuuu");
    }
}
