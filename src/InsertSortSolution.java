import java.util.Scanner;

public class InsertSortSolution {
    public static void insertSort(int[] arr){
        if(arr==null||arr.length<1){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            for(int j = i - 1;j>=0&&arr[j]>arr[j+1];j--){
                Util.swap(arr,j,j+1);
            }
        }
    }



    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ucCount = s.nextInt();
        s.nextLine();
        while (ucCount-->0){
            int[] arr = Util.handleInput(s);
            insertSort(arr);
            Util.displayArray(arr);
        }
    }
}
