package backtracking.permutation;

import java.util.LinkedList;
import java.util.Queue;

public class Permutation {
	
	public static void main(String[] args) {
		Permutation obj = new Permutation();
		Queue<String> result = obj.findAll("abc");
		result.stream().forEach(System.out::println);
	}

	public Queue<String> findAll(String arr){
		
		if(arr.length()==1) {
			Queue<String> result = new LinkedList<>();
			result.add(arr);
			return result;
		}
		
		char a = arr.charAt(0);
		
		Queue<String> result = findAll(arr.substring(1)); // find all permutation without firstElement
		
		int size = result.size();
		for(int i=0; i<size; i++) {
			String str = result.poll();
			for(int j=0; j<=str.length(); j++) {
				result.add(str.substring(0,j)+a+str.substring(j,str.length())); //adding first element in all position 0 till end of string
			}
		}
		
		return result;
		
	}

}
