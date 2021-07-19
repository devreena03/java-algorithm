

###1. Max Ribbon cut
Given an array of integers with elements representing lengths of ribbons. Your goal is to obtain k ribbons of equal length cutting the ribbons into as many pieces as you want.

Find the maximum integer length L to obtain at least k ribbons of length L.

Example 1:

Input: arr = [1, 2, 3, 4, 9], k = 5
Output: 3
Explanation: cut ribbon of length 9 into 3 pieces of length 3, length 4 into two pieces one of which is length 3 and the other length 1,
and one piece is already is of length 3. So you get 5 total pieces (satisfying k) and the greatest length L possible which would be 3.

https://leetcode.com/discuss/interview-question/388503/Google-or-Phone-Screen-or-Cut-Ribbon/350993

###2.Maximum product cutting
Given a rope of length n meters, cut the rope in different parts of integer lengths in a way that maximizes product of lengths of all parts. You must make at least one cut. Assume that the length of rope is more than 2 meters. 
Examples: 

Input: n = 2
Output: 1 (Maximum obtainable product is 1*1)

Input: n = 3
Output: 2 (Maximum obtainable product is 1*2)

Input: n = 4
Output: 4 (Maximum obtainable product is 2*2)

Input: n = 5
Output: 6 (Maximum obtainable product is 2*3)

https://www.geeksforgeeks.org/maximum-product-cutting-dp-36/

###3. Maximum wood cutting
Given an int array wood representing the length of n pieces of wood and an int k. It is required to cut these pieces of wood such that more or equal to k pieces of the same length len are cut. What is the longest len you can get?

Example 1:

Input: wood = [5, 9, 7], k = 3
Output: 5
Explanation: 
5 -> 5
9 -> 5 + 4
7 -> 5 + 2
Example 2:

Input: wood = [5, 9, 7], k = 4
Output: 4
Explanation: 
5 -> 4 + 1
9 -> 4 * 2 + 1
7 -> 4 + 3

https://leetcode.com/discuss/interview-question/354854/

###4. https://leetcode.com/problems/koko-eating-bananas/






