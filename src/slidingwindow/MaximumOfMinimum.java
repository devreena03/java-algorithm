package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfMinimum {
	
	public static void main(String[] args) {
		MaximumOfMinimum obj = new MaximumOfMinimum();
		int[] max = obj.slidingMaximunOfMinimum(new int[] {10, 20, 30, 50, 10, 70, 30});
		
		for (int i : max) {
			System.out.print(i+ " ");
		}
	}
	
	public int[] slidingMaximunOfMinimum( int[] arr) {
		 int n = arr.length;
		 int[] res = new int[n];
		 for(int i=0; i<n; i++) {
			 res[i] = slidingMinimum(arr, i+1);
		 }
		 return res;
	}
	
	public int slidingMinimum( int[] arr, int k) {
       
        int n = arr.length;
        int i=0;
        int j=0;

        Deque<Integer> deque = new LinkedList<>();
        int max = Integer.MIN_VALUE;

        while(j<n){

            while(!deque.isEmpty() && deque.getLast()>arr[j]){
                deque.removeLast();
            }
            deque.addLast(arr[j]);

            if(j-i+1<k){
                j++;
            } else {
                int a = deque.getFirst();
                max = Math.max(max, a);
                if(a==arr[i]){
                    deque.removeFirst();
//                    if(j+1<n && arr[j+1]>deque.getFirst()){
//                        deque.clear();
//                    }
                }
                i++;
                j++;               
            }
        }
    return max;
}

}
