import java.util.Scanner;
public class Problem_59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 & j==n/2){
                    System.out.print("0");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}