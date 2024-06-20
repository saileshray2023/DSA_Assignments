

public class ArrayReversePrinting {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        reverse(arr,arr.length-1);
    }
    public static void reverse(int[] arr, int index){
        if(index>=0){
            System.out.print(arr[index]);
            reverse(arr,index-1);
        }






    }
}
