import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(m>n){
            System.out.println("less");
        }
        
        else if(m==n){
            System.out.println("equal");
        }
        
        else if(m<n){
            System.out.println("greater");
        }
    }
}