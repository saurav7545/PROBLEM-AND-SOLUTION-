
import java.util.Scanner;
public class Tabl {
    public static void main(String[] args) {
        
              
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your table number: ");
        int a = sc.nextInt();
        int sum=0;
        for(int i=1; i<=10; i++){
            int table=a*i;
             System.out.println(table);
             sum= sum + table;
             
        }
        System.out.println("suma of table:"+ sum);
       
        
    }
}
