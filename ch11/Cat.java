package ch11;

public class Cat extends Pets{
    public static String hmm;

    public Cat(){
        this.name = "Maria";
        this.color = "white";
    }

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void makeMau(){
        System.out.println("Mauuuuuu");
    }
}
