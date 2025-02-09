import java.util.Scanner;
public class Problem_03 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number");
	    int n= sc.nextInt();
	    // for Upper
	    for(int i=0; i<=(n);i++){
	        for(int j=i;j>=0;j--){
	            System.out.print(n - j);
	        }
	        	System.out.println();
	    }
	    // for Lower part
	    for(int i=n; i>0;i--){
	        for(int j=i;j>0;j--){
	            System.out.print((n+1) - j  );
	        }
	        System.out.println();
	    }
	}
    
}
