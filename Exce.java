import java.util.*;
class Exce{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        try {
            if(age<18){
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException e) {
            System.out.println("Age error");
        }
    }
}
class InvalidAgeException extends Exception{

}