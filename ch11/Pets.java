package ch11;

public class Pets {
    protected String name;
    protected String color;

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

    protected void Pets(){
        this.name = "Number1";
        this.color = "white";
    }

    protected void Pets(String name, String color){
        this.name = name;
        this.color = color;
    }

    protected void eat(){
        System.out.println("Eating");
    }
}
