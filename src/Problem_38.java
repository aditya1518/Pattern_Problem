import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter the number of lines(Lines must be odd).");
	    int n=sc.nextInt();
	    if(!(n%2==0)){
    	    for(int i=0;i<n;i++){
    	        for(int j=0;j<n;j++){
    	            if(j==(n/2)-i || j==(n/2)+i || (i>n/2 && (j==i-(n/2) || j==(3 * n / 2) - i - 1 ))){
    	                System.out.print("*");
    	            }else{
    	                System.out.print(" ");
    	            }
    	        }
    	        
    	        System.out.println();
    	        
    	    }
	    }else{
	        System.out.print("Please enter Odd number.");
	    }
	}
}
