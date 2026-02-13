// to check the given number is postive,negative and zero using java  without fuction 
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your table number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    
    }
}
