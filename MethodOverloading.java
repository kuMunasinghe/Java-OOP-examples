import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        enternum(a);
        enternum(a, b);



    }
    static void enternum(int i){
        System.out.println("You entered first"+i);
    }

    static void enternum(int a,int b){
System.out.print("You overload the enternum "+a+" "+b);
    }

}
