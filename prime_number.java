package practice;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        System.out.println("Enter any number: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            int j=2;
            for( j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    break;
                }
            }if(j>Math.sqrt(i)){
                System.out.println(i+"\t");
            }

        }
        input.close();

    }
}
