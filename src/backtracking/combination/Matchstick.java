package backtracking.combination;

import java.util.Arrays;

public class Matchstick {

	int count;
    boolean[] visited;
    
    public static void main(String[] args) {
    	Matchstick obj = new Matchstick();
    	int[] matchsticks = new int[] {1,1,2,2,2};
    	int[] matchsticks1 = new int[] {3,3,3,3,4};
    	int[] matchsticks2 = new int[] {5969561,8742425,2513572,3352059,9084275,2194427,1017540,2324577,6810719,8936380,7868365,2755770,9954463,9912280,4713511};
    	int[] matchsticks3 = new int[] {5,5,5,5,16,4,4,4,4,4,3,3,3,3,4};
    	int[] matchsticks4 = new int[] {10,6,5,5,5,3,3,3,2,2,2,2};
		System.out.println(obj.makesquare(matchsticks));
	}
   
    public boolean makesquare(int[] matchsticks) { 
         count = 0;
        int arraySum = Arrays.stream(matchsticks).reduce(0,(a,b)->a+b);
        
        if(arraySum%4!=0) return false;
        
        int sum = arraySum/4;
        
        Arrays.sort(matchsticks);
        
        if(matchsticks[matchsticks.length-1]>sum) return false;
       
        visited = new boolean[matchsticks.length];
        return backtracking(matchsticks, 0, sum, sum, 0 );
        
    }
    
    private boolean backtracking(int[] arr, int i, int sum, int target, int count){
        
        if(count==3) return true;
        
        if (i == arr.length) return false;
        
        if(sum==0) 
            return backtracking(arr,0, target, target, count+1); //start from first   
        
        if(!visited[i] && arr[i] <= sum) {
        	 visited[i] = true;
        	 if (backtracking(arr, i+1, sum-arr[i], target, count)) //including
             	return true;
        	 visited[i] = false;
        }
       
        return backtracking(arr, i+1, sum, target, count); //not including
 
    }
}
