import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int multi;

        // code here
        for(int i=1;i<=10;i++){
            multi=i*n;
            System.out.print(multi+" ");
        }
       // System.out.print(multi);//yha likhoge to har baar purani value replace hogi
    }
}