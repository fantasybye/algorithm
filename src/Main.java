import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int T = sc.nextInt();
            while (T-- > 0) {
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i = 0;i < size; i++){
                    arr[i] = sc.nextInt();
                }
                layerOrder(arr);
            }
        }
    }
    public static void layerOrder(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        if(arr==null) {System.out.println();return;}
        queue.offer(0);
        while (!queue.isEmpty()){
            int size = queue.size();
            int[] res = new int[size];
            for(int i = 0;i<size;i++){
                int index = queue.poll();
                if(index * 2 + 1 <= arr.length - 1)
                    queue.offer((2*index + 1));
                if(index * 2 + 2 <=arr.length - 1)
                    queue.offer((2*index +2));
                res[i] = arr[index];
            }
            Arrays.sort(res);
            println(res);
        }

    }
    private static void println(int[] arr) {
        StringBuilder sb = getStringBuilder(arr);
        System.out.println(sb.toString());
    }

    private static StringBuilder getStringBuilder(int[] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        return sb;
    }
}

