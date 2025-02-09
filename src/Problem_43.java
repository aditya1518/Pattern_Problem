import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n =sc.nextInt();
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<2*n;j++){
                if((i==0 || j<=n-1-i || j>=n+i) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
        System.out.println();
    }
}