import java.util.*;
public class PalindromePyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= sc.nextInt();
        
        if(n>=1){
            for(int i=0; i<=n; i++){ //rows
                for(int j=0; j<=n-i; j++){ //columns
                    System.out.print(" "); 
                }
            
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
            
                for(int j=2; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Enter a positive number!");
        }
    }
}