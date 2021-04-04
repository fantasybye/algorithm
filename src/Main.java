import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine();
        while(count-->0){
            int[] arr = handleInput(s);
            int[] interval = handleInput(s);
            int left = interval[0],right = interval[1];
            int[] narr = new int[right-left+1];
            for(int i = 0;i < narr.length;i++){
                narr[i] = arr[left-1+i];
            }
            Arrays.sort(narr);
            int k = Integer.parseInt(s.nextLine());
            System.out.println(narr[k-1]);
        }
    }
    public static int[] handleInput(Scanner s){
        String str = s.nextLine();
        String[] sarr = str.split(" ");
        int[] arr = new int[sarr.length];
        for(int i = 0;i < arr.length; i++){
            arr[i] = Integer.parseInt(sarr[i]);
        }
        return arr;
    }
}