import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int choice;
        int a,b,result;
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Modules\n5.Division");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a%b);
            break;
            case 5:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Wrong operation");


        }
        sc.close();

    }
    
}
