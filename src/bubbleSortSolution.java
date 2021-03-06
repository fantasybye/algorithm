import java.util.Scanner;

public class bubbleSortSolution {
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2)
            return;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length - 1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
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
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ucCount = s.nextInt();
        s.nextLine();
        while(ucCount-->0){
            int[] arr = handleInput(s);
            bubbleSort(arr);
            displayArray(arr);
        }
    }
}

