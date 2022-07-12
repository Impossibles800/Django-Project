import java.util.Scanner;

public class MIN_No_of_sq {

    public static int Min_Number(int n){
//        Without DP
//        if (n<=3)
//            return n;
//        int result =n;
//        for (int i = 1; i <=n ; i++) {
//            int temp = i*i;
//            if (temp >n)
//                break;
//            else
//                result = Math.min(result,1+Min_Number(n-temp));
//        }
//        return result;


        if (n<=3)
            return n;
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <=n ; i++) {
            dp[i] = i;
            for (int j = 1; j <= Math.ceil(Math.sqrt(i)) ; j++) {
                int temp = j*j;
                if (temp>i)
                    break;
                else
                    dp[i] = Math.min(dp[i],1+dp[i-temp]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(Min_Number(scanner.nextInt()));
    }
}
