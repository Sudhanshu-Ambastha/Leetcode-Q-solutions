class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int rowMax[] = new int [grid.length];
        Arrays.fill(rowMax,Integer.MIN_VALUE);
        int ans= 0;
        int collength = grid[0].length;

        while(collength>0){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    rowMax[i] = Math.max(grid[i][j],rowMax[i]);
                }
            }
            ans = ans + Arrays.stream(rowMax).max().getAsInt();
            for (int i = 0; i <grid.length ; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j]== rowMax[i]) {
                        grid[i][j]= Integer.MIN_VALUE;
                        rowMax[i]= Integer.MIN_VALUE;
                    }
                }
            }
            collength--;
        }
        return ans;
    }
}
