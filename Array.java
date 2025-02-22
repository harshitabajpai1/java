package CSE392;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int size=input.nextInt();
        int[] arr= new int[size];
        for( int i=0; i< size; i++){
            arr[i]=input.nextInt();
        }
//        for( int i=0; i<size ;i++){
//            System.out.print(arr[i]+ " ");
//        }


        //all possible subarrays with size K;
          int k=input.nextInt();
//        int maxsum=Integer.MIN_VALUE;
//
//        int ptr1=0;
//        int ptr2=k-1;
//        while(ptr2<size){
//            int start=ptr1;
//            int sum=0;
//            while(start<=ptr2){
//                System.out.print(arr[start]+" ");
//                sum+=arr[start];
//                start++;
//            }
//            System.out.println();
//            ptr1++;
//            ptr2++;
//            maxsum=Math.max(maxsum,sum);
//
//        }
//        System.out.println(maxsum);


        //in time complexity O(N);

        int total=0;
        for(int i=0;i<k;i++){
            total=total+arr[i];
        }
        int max=total;
//        System.out.println(total);
        int start=0;
        int end=k;
        while(end<size){
            total=total-arr[start]+arr[end];
//            System.out.println(total-arr[start]+arr[end]);
            max=Math.max(max,(total));
            start++;
            end++;
        }
        System.out.println(max);


    }
}
//subarray: no elements should be skipped in between;
//insertion/ deletion at particular index in an array?

//max sum subarray of size k;