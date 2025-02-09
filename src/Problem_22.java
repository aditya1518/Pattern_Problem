import java.util.Scanner;
public class Problem_22{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int n =sc.nextInt();
	   // Upper Part
	    for(int i=1;i<=n;i++){
	        for(int j =0;j<=n;j++){
	           if(j<=n-i){
	               System.out.print(" ");
	           }
	           else{
	               System.out.print("* ");
	           }
	        }
	        System.out.println();
	    }
	   // Lower Part
	    for(int i=1;i<n;i++){
	        for(int j=n;j>=0;j--){
	            if(j>=n-i){
	                System.out.print(" ");
	            }
	            else{
	                System.out.print("* ");
	            }
	        }
	        System.out.println();
	    }
	}
	
}