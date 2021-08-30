# Unbounded Knapsack problem
Given a knapsack weight W and a set of n items with certain value val[i] and weight wt[i], we need to calculate the maximum amount that could make up this quantity exactly. This is different from classical Knapsack problem, here we are allowed to use unlimited number of instances of an item.

Input : W = 100
       val[]  = {1, 30}
       wt[] = {1, 50}
Output : 100
There are many ways to fill knapsack.
1) 2 instances of 50 unit weight item.
2) 100 instances of 1 unit weight item.
3) 1 instance of 50 unit weight item and 50
   instances of 1 unit weight items.
We get maximum value with option 2.

Input : W = 8
       val[] = {10, 40, 50, 70}
       wt[]  = {1, 3, 4, 5}       
Output : 110 
We get maximum value with one unit of
weight 5 and one unit of weight 3.

Q 1. find maximum profit?
Q 2. weights picked in bag? 

## Unbounded Knapsack Based Problem
###1. Rod Cutting problem
Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. Determine the  maximum value obtainable by cutting up the rod and selling the pieces. 

Example: 
length[] = [1,2,3,4,5,6,7,8] 
price[] =  [1,5,8,9,10,17,17,20]

If length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)

https://www.geeksforgeeks.org/cutting-a-rod-dp-13/

###2. coin change prob - min no of coins 
Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?

Example:
Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required

We can use one coin of 25 cents and one of 5 cents 

https://leetcode.com/problems/coin-change/

###3. coin change prob - count the no of ways to make a sum with given coins
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Example:
for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.
 So output should be 4.
 
 https://www.geeksforgeeks.org/coin-change-dp-7/


###4. Max Ribbon cut
Polycarpus has a ribbon, its length is n. He wants to cut the ribbon in a way that fulfils the following two conditions:

    After the cutting each ribbon piece should have length a, b or c.
    After the cutting the number of ribbon pieces should be maximum. 

Help Polycarpus and find the number of ribbon pieces after the required cutting.

Example:
1) Input: n = 5; arr[] = [5,3,2]
o/p - 2 , Polycarpus can cut the ribbon in such way: the first piece has length 2, the second piece has length 3
2)n=7; arr=[5,5,2]
0/p - 2,  Polycarpus can cut the ribbon in such way: the first piece has length 5, the second piece has length 2. 

http://codeforces.com/problemset/problem/189/A







