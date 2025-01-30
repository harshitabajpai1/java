package java_code.sorting;
import java.util.*;


//Time complexity--> O(n^2)
public class Selection_sort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size the array: ");
        int n=input.nextInt();
        System.out.println("enter the unsorted array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0; i<n-1;i++){
            int smallestIdx=i;  //unsorted part sorting
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallestIdx]){
                    smallestIdx=j;
                }
            }
            //swapping
            int temp=arr[i];
            arr[i]=arr[smallestIdx];
            arr[smallestIdx]=temp;
        }

        System.out.println("the sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
