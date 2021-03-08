import java.util.Scanner;

public class Util {
    public static void swap(int[] arr,int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }

    public static void displayArray(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println();
    }

    public static int[] handleInput(Scanner s){
        String str = s.nextLine();
        String[] sarr = str.split(" ");
        int[] arr = new int[sarr.length-1];
        for(int i = 0;i < arr.length; i++){
            arr[i] = Integer.parseInt(sarr[i+1]);
        }
        return arr;
    }
}
