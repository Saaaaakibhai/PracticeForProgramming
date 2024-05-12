package basicprogramming;

import java.util.Scanner;

public class arraymanipulation {
    public static void main(String[] args) {
        int q,n;
        Scanner input=new Scanner(System.in);
        //Queries = rows
        //N = Columns

        n = input.nextInt();
        q = input.nextInt();
        int queries [][] = new int [n][q];
        long arr []= new long[n+2];

        for (int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            arr[a] = arr[a]+k;
            arr[b+1]= arr[b+1]-k;
        }
        long max = 0;
        for (int i = 1; i<=n;i++){
            arr[i]= arr[i]+arr[i-1];
            max = Math.max(arr[i],max);
        }
        return max;
    }

}
