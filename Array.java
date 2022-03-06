import java.util.Scanner;

class Array{
    public static void main(String[] args) {
        int [] arr=new int[10];

        for(int i=0;i<10;i++){
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            arr[i]=a;
            
        }
        

        for(int i=0;i<10;i++){
            System.out.println(String.valueOf( arr[i]));
        }
    }
}