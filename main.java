class Main {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
    //   int left=0;
    //   int right=arr.length-1;
       reverseArray(0,arr.length-1,arr);
       for (int num:arr) {
            System.out.print(num+" ");
        }
       
    }
    static void reverseArray(int left,int right,int[] arr){
        if(left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(left+1,right-1,arr);
    }
}