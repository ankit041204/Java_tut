class Animal{
    void eat(){
        System.out.println("Animal eat food");
    }
}
     interface pet{

        void sound();
    }
    
        

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class puppy extends Dog implements pet{
    public void sound(){
        System.out.println("puppy makes cute sound");
    }
}
public class HybridInheritance{
    public static void main (String args[]){
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.sound();
    }
}