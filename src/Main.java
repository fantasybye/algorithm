import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine();
        while(count-->0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] arr = new int[n][m];
            for(int i = 0;i < n;i++){
                for (int j = 0;j < m;j++){
                    arr[i][j] = s.nextInt();
                }
            }
            System.out.println(getMaxMatrix(arr));
        }
    }

    public static int getMaxMatrix(int[][] matrix) {
        int max=Integer.MIN_VALUE;
        int dp=0,start=0;
        int ans=0;//结果
        int[] sum=null;//纵向累加数组
        for(int i=0;i<matrix.length;i++) {
            sum=new int[matrix[0].length];
            for(int j=i;j<matrix.length;j++) {
                dp=0;start=0;
                for(int k=0;k<sum.length;k++) {
                    sum[k]+=matrix[j][k];
                    dp+=sum[k];
                    if(max<dp) {
                        ans = (j-i)*(k-start);
                        max=dp;
                    }
                    if(dp<0) {
                        dp=0;start=k+1;
                    }
                }
            }
        }
        return ans;
    }
}