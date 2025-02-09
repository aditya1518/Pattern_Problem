import java.util.Scanner;
public class Problem_22{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int n=sc.nextInt();
        // for Uper Part
	    for(int i=0;i<n;i++){
            for (int j =n-i; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Part
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print(" ");
             }
            for(int j=(n-1)-i;j>0;j--){
                System.out.print("* ");
            }
             
            System.out.println();
        }
        
	}
}