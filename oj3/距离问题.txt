import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOftest = scanner.nextInt();
        while (numOftest-->0) {
            int N = scanner.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            for(int i = 0;i<N;i++){
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            func(N, x, y);
        }
    }
    static class Position{
        int x;
        int y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static void func(int n, int[] x, int[] y){
        Map<Integer, Integer> xmap = new HashMap<>();
        Map<Integer, Integer> ymap = new HashMap<>();
        Map<Position, Integer> xymap = new HashMap<>();

        for(int i = 0 ; i < n ; i ++){
            int countx = xmap.getOrDefault(x[i], 0);
            countx++;
            xmap.put(x[i], countx);

            int county = ymap.getOrDefault(y[i], 0);
            county++;
            ymap.put(y[i], county);

            Position position = new Position(x[i], y[i]);
            int countxy = xymap.getOrDefault(position, 0);
            countxy ++;
            xymap.put(position, countxy);
        }

        int res = 0;
        for (Integer i: xmap.values()){
            res += i*(i-1)/2;
        }
        for(Integer i : ymap.values()){
            res += i*(i-1)/2;
        }
        for(Integer i : xymap.values()){
            res -= i*(i-1)/2;
        }
        System.out.println(res);
    }
}