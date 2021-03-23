import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOftest = scanner.nextInt();
        while (numOftest-->0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] K = new int[N];
            int[] Q = new int[M];
            for(int i = 0;i<N;i++){
                K[i] = scanner.nextInt();
            }
            for(int i = 0;i < M;i++){
                Q[i] = scanner.nextInt();
            }
            for(int i = 0;i < M - 1;i++){
                System.out.print(countDivisibility(Q[i],K) + " ");
            }
            System.out.print(countDivisibility(Q[M - 1],K));
            System.out.println();
        }
    }

    private static int countDivisibility(int qi, int[] K){
        int res = 0;
        for(int i = 0;i < K.length;i++){
            if(K[i] % qi == 0)
                res++;
        }
        return res;
    }
}