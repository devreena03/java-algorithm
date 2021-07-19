# Combination problem
Given an array of positive integers arr[] , find all unique combinations in arr[]

I/p - [abc]
o/p - [],[a],[b],[c],[ab],[bc],[ac],[abc]

->[a,b] and [b,a] are same
->one value can include or exclude 
-> repetition may or may not allowed
-> time complexity )(2^n)

 [image]


## Combination Based Problem
###1. Find all possible combination of a integer arr. 
Input: arr = [6, 10, 12];
o/p - [] , [6], [10], [12], [6,10], [6,12], [10,12], [6,10,12]	
https://leetcode.com/problems/subsets/

###2. Combinational Sum with repetition
Given an array of positive integers arr[] and a sum x, find all unique combinations in arr[] where the sum is equal to x. 

The same repeated number may be chosen from arr[] unlimited number of times. 

Input : arr[] = 2, 4, 6, 8 
            x = 8
Output : [2, 2, 2, 2]
         [2, 2, 4]
         [2, 6]
         [4, 4]
         [8]

https://www.geeksforgeeks.org/combinational-sum/

###2. Combinational Sum without repetition
Given an array of positive integers arr[] and a sum x, find all unique combinations in arr[] where the sum is equal to x. 

Each number in arr may only be used once in the combination.
Input: arr = [10,1,2,7,6,1,5], sum = 8
Output: [1,1,6],
		[1,2,5],
		[1,7],
		[2,6]
		
https://leetcode.com/problems/combination-sum-ii/		
