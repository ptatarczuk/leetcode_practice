package org.example.OneD_DP;

import java.util.LinkedList;
import java.util.Queue;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int cs = 0;
        boolean[] vstd = new boolean[amount+1];
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0;i<n;i++) {
                int sum = q.poll();
                if(sum==amount) {
                    return cs;
                }
                if(sum>amount || vstd[sum]) {
                    continue;
                }
                vstd[sum]=true;
                for(int coin:coins) {
                    q.add(sum+coin);
                }
            }
            cs++;
        }
        return -1;
    }
}
