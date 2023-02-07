import java.util.Scanner;
public class MyCal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1:");
        int num1=sc.nextInt();
        System.out.println("enter number2:");
        int num2=sc.nextInt();
        int result=num1+num2;
        System.out.println("addition of two numbers is:"+result);
    }
}
