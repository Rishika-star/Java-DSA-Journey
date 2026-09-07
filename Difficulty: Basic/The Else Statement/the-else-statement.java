import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // code here
        if(a>100){
            System.out.print("Big");
        }
        else {
            System.out.print("Small");
        }
    }
}