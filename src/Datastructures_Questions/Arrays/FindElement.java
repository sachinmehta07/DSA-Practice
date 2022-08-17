package Datastructures_Questions.Arrays;
public class FindElement {

    static void search(int arr[],int n,int element){
        for(int i=0;i<n;i++){
            if(arr[i] == element){
                System.out.println("Element Found at index :" + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        search(arr,arr.length,4);
    }

}
