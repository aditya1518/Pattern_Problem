import java.util.Scanner;
public class Problem_01
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number");
	    int n= sc.nextInt();
	    // for Upper
	    for(int i=0;i<=(n)/2;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print("* ");
	        }
	        	System.out.println();
	    }
	    // for Lower part
	    for(int i=0; i<n/2;i++){
	        for(int j=n/2;j>i;j--){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}