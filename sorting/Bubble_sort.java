package java_code.sorting;
import java.sql.SQLOutput;
import java.util.*;

//time complexity---> bigO(n^2);
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size the array: ");
        int n=input.nextInt();
        System.out.println("enter the unsorted array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        //bubble sort
        for(int i=0;i<n-1;i++){
            boolean isSwap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSwap=true;
                }
                if(!isSwap){ //array already sorted
                    System.out.println("array is already sorted");
                    return;
                }

            }
        }
        System.out.println("the sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
