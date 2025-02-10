public class Super_keyword {
    public static void main(String [] args) {
        Hors h= new Hors();
    }

}

class Animl{
    Animl(){
        System.out.println("animal is called");
    }
} 
class Hors extends Animl{  
   Hors(){
    
    System.out.println("Horse is called");
   }
}

