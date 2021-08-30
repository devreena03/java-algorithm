# 0/1 Knapsack problem
Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. 
we cannot break an item, either pick the complete item or don’t pick it (0-1 property).

Input:  val[] = [6, 10, 12];
		weight[] = [1, 2 ,3];
		bag capacity (W) = 5;		

Q 1. find maximum profit? Output - 22
Q 2. weights picked in bag? Output - {2, 3}


## 0/1 Knapsack Based Problem
###1. Subset Sum
Given a set of non-negative integers and a value sum, determine if there is a subset of the given set with sum equal to given sum.
Example:
Input:  arr[] = {3, 34, 4, 12, 5, 2}, 
		sum = 9
Output:  True / False

Ref : https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

###2. Equal Sum partition
Equal Sum Partition Problem
Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.
Examples:

Input arr[] = {1, 5, 11, 5}
Output: true 
The array can be partitioned as {1, 5, 5} and {11}

###3. Count of subset sum
Count of subsets sum with a Given sum
Given an array arr[] of length N and an integer X, the task is to find the number of subsets with sum equal to X.
Example:

Input: arr[] = {1, 2, 3, 3}, X = 6
Output: 3
All the possible subsets are {1, 2, 3},{1, 2, 3} and {3, 3}

###4. min subset sum diff
Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.

Example:
Input:  arr[] = {1, 6, 11, 5} 
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11 

If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.
###5. Traget sum
Target Sum Problem
Given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.

Example 2:
Input: arr = [1,1,2,3] , S=1;


###6. count of subset for given difference
arr = [1,6,5,11] , diff = 1;
s1={1,6,5} s2={11} diff=s2-s1=1;
count=1;




