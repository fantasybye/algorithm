import java.util.Scanner;

public class bubbleSortSolution {
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2)
            return;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length - 1;j++){
                if(arr[j]>arr[j+1])
                    Util.swap(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            int[] arr = Util.handleInput(s);
            bubbleSort(arr);
            Util.displayArray(arr);
        }
    }
}

