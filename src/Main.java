import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        while(count-->0){
            int n = s.nextInt();
            int[] ddl = new int[n];
            int[] profit = new int[n];
            for(int i = 0; i < n; i++){
                s.nextInt();
                ddl[i] = s.nextInt();
                profit[i] = s.nextInt();
            }
            maxProfit(n,ddl,profit);
        }
    }
    public static void maxProfit(int n,int[] ddl,int[] profit) {
        int[] timeProfit = new int[n];
        int max = 0,sum = 0,count = 0,id=0;
        while (true) {
            for (int i = 0; i < n; i++) {
                timeProfit[i] = ddl[i] <= 0 ? 0 : profit[i] / ddl[i];
                if(max < timeProfit[i]){
                    max = timeProfit[i];
                    id = i;
                }else
                    ddl[i]--;
            }
            if(max > 0){
                count++;
                sum+=profit[id];
                ddl[id] = 0;
                max = 0;
            }else{
                System.out.println(count+" "+ sum);
                break;
            }
        }
    }
}