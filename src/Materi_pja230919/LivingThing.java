package Materi_pja230919;

public abstract class LivingThing {
    public void breath(){
        System.out.println("Living Thing Breathing.....");
    }
    
    public void eat(){
        System.out.println("Living Thing eating......");
    }
    
    public abstract void walk();
}
