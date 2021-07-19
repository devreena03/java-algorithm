package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingMaximum {
	public static void main(String[] args) {
		SlidingMaximum obj = new SlidingMaximum();
		int[] n = obj.slidingMaximum(new int[] {1,3,-1,-3,5,3,6,7}, 3);
		
		for (int i : n) {
			System.out.print(i+ " ");
		}
	}
	public int[] slidingMaximum(final int[] arr, int k) {
	        if(k==1) return arr;
	        
	        int n = arr.length;
	        int i=0;
	        int j=0;
	
	        Deque<Integer> deque = new LinkedList<>();
	        int[] res = new int[n-k+1];
	
	        while(j<n){
	
	            while(!deque.isEmpty() && deque.getLast()<arr[j]){
	                deque.removeLast();
	            }
	            deque.addLast(arr[j]);
	
	            if(j-i+1<k){
	                j++;
	            } else {
	                int a = deque.getFirst();
	                res[i] = a;
	                if(a==arr[i]){
	                    deque.removeFirst();
	                    if(j+1<n && arr[j+1]>deque.getFirst()){
	                        deque.clear();
	                    }
	                }
	                i++;
	                j++;               
	            }
	        }
	    return res;
	}
}

