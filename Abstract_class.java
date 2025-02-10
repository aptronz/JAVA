
public class Abstract_class{
    public static void main(String[] args) {
        Horse n= new Horse();
        n.eat();
        n.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{ //yahan walk function banane se pehle red line on horse cuz of walk function animal k paas tha to ab horse k paas hai to 
    void  walk(){            // isko implement jarur krna hai
        System.out.println("on 4 legs");
    }                 
}
class Chicken extends Animal{  // "  " " "
    void walk(){
        System.out.println("on 2 legs");
    }
    
}