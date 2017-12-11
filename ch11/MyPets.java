package ch11;

public class MyPets {
    public static void main(String args[]){
        Cat myCat = new Cat();

        Cat yourCat = new Cat("Pepi", "black");

        Dog myDog = new Dog();

        System.out.println("My dogs name is " + myDog.getName());

        System.out.println(myCat.getColor());

        System.out.println(myDog.getColor());

        myCat.makeMau();
        myCat.eat();

        Cat.hmm = "Hmmmmm";

        System.out.println(Cat.hmm);

    }
}
