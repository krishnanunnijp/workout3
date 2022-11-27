import java.util.Scanner;

public class Driver6Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize =sc.nextInt();
        int arr[]=new int[arraySize];
        for(int i = 0; i< arraySize; i++)
        {
            arr[i]=sc.nextInt();
        }
        sortOrSearch sortOrSearch=new sortOrSearch(arraySize,arr);

        int element =sc.nextInt();
        sortOrSearch.search( element);

        int[] sortArr=sortOrSearch.getSortArray();
        System.out.println("Sorted Array:");

        for(int i=0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\t");
        }
    }
}
