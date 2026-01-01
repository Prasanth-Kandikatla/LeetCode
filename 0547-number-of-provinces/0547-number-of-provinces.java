class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visit = new boolean[n + 1];
        int noOfProvinces = 0;

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                noOfProvinces++;
                helper(i, isConnected, visit);
            }
        }
        return noOfProvinces;
    }

    public void helper(int node, int[][] isConnected, boolean[] visit) {
        visit[node] = true;
        for (int i = 0; i<isConnected.length; i++) {
            if(isConnected[node][i] == 1 && !visit[i]) {
                helper(i,isConnected,visit);
            }
        }
    }
}