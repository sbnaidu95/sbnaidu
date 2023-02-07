
import java.util.Scanner;
public class VoterAge {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("your are eligible for voting");
        }
        else{
            System.out.println("your are not eligible for voting");
        }
    }

}
