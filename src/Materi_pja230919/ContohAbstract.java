package Materi_pja230919;

public class ContohAbstract {
    public static void main(String[] args) {
        Human human = new Human();
        human.breath();
        human.eat();
        human.walk();
        
        Dog dog = new Dog();
        dog.breath();
        dog.eat();
        dog.walk();
    }
}