public class LandSea
{
    public static void main(String[] args) 
    {
        // int[][] grid = { {1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};  
        // int[][] grid = { {1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};  
        // int[][] grid = { {1,1,0,1,1},{1,1,0,0,1},{0,0,1,0,0},{0,0,0,1,1}}; 
        // int[][] grid = { {1,1,1,0,0},{1,1,1,0,1},{0,0,1,0,1},{1,0,0,1,1}};  
        int[][] grid = { {0,0,0,1,1},{1,0,1,0,0},{1,0,1,1,1},{0,1,0,0,0}};  
        Solution s = new Solution();      
        System.out.println(s.numIslands(grid));
    }
}
class Solution 
{
    int m = 0 ;
    int n = 0 ;
    
    private boolean check( int[][] grid , int i , int j )
    {
        grid[i][j] = 2 ;
        if( (j > 0 && grid[i][j-1] == 2 ) || ( i > 0 && grid[i-1][j] == 2 ) || (i < m-1 && grid[i+1][j] == 2 ) )
            return false ;
        return true ;
    }

    public int numIslands(int[][] grid) 
    {
        m = grid.length ;
        n = grid[0].length ;
        int count = 0 ;
        for( int i = 0 ; i < m ; i++ )
        {
            for( int j = 0 ; j < n ; j++ )
            {
                if( grid[i][j] != 0 && check(grid,i,j))
                {
                    count++ ;
                }
            }
        }         
        return count ;
    }
}