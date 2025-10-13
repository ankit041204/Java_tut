public class RecursionFirstOccurence{
    public static int firstOccurence(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurence (arr,key,i+1);
    }
    public static void main (String args[]){
        int arr[] = {8,3,5,6,3,8,6,9};
        System.out.println(firstOccurence(arr,9, 0));
    }
}