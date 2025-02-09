import java.util.Scanner;
public class Problem_02
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number");
	    int n= sc.nextInt();
	    // for Upper
	    for(int i=0; i<=(n);i++){
	        for(int j=0;j<=i;j++){
	            System.out.print(n - j );
				System.out.print(" ");
	        }
	        	System.out.println();
	    }
	    // for Lower part
	    for(int i=0; i<n;i++){
	        for(int j=n;j>i;j--){
	            System.out.print(j);
				System.out.print(" ");

	        }
	        System.out.println();
	    }
	}
}