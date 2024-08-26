<h2><a href="https://leetcode.com/problems/kth-missing-positive-number">Kth Missing Positive Number</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given an array <code>arr</code> of positive integers sorted in a <strong>strictly increasing order</strong>, and an integer <code>k</code>.</p>

<p>Return <em>the</em> <code>k<sup>th</sup></code> <em><strong>positive</strong> integer that is <strong>missing</strong> from this array.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [2,3,4,7,11], k = 5
<strong>Output:</strong> 9
<strong>Explanation: </strong>The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5<sup>th</sup>&nbsp;missing positive integer is 9.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2,3,4], k = 2
<strong>Output:</strong> 6
<strong>Explanation: </strong>The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 1000</code></li>
	<li><code>1 &lt;= arr[i] &lt;= 1000</code></li>
	<li><code>1 &lt;= k &lt;= 1000</code></li>
	<li><code>arr[i] &lt; arr[j]</code> for <code>1 &lt;= i &lt; j &lt;= arr.length</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<p>Could you solve this problem in less than O(n) complexity?</p>


Here's a refined and clearer version of your notes with corrections:

---
### Brute Force Approach  
### Understanding the Logic

To grasp the logic, consider the following scenarios:

1. **Empty Array Example**:
   - Suppose you are given an empty array and asked to find the 4th missing element. 
   - Since there are no elements in the array, the missing elements are simply the first few positive integers. 
   - Therefore, the 4th missing element will be `k` itself, which is `4`.

2. **Array Example [4, 5, 6]**:
   - If you have the array `[4, 5, 6]` and need to find the 3rd missing element, the answer is straightforward.
   - The array starts from 4, so the first three missing elements are `1`, `2`, and `3`. 
   - Therefore, the 3rd missing element is `3` itself.

3. **Array Example [3]**:
   - Now, consider the array `[3]`, and you need to find the 3rd missing element.
   - The sequence of positive integers is `[1, 2, 3, 4, 5, ...]`. 
   - Since `3` is present in the array, the 3rd missing element isn't `3` anymore.
   - We increment `k` to account for this, so the answer becomes `4`.

4. **Array Example [3, 4]**:
   - If the array is `[3, 4]` and you need to find the 3rd missing element:
   - The sequence is `[1, 2, 3, 4, 5, 6, 7, 8, ...]`. 
   - Here, both `3` and `4` are present in the array, so the 3rd missing element isn't `3`.
   - The answer, in this case, is `5`, as we adjust `k` for both `3` and `4`.

5. **Array Example [3, 4, 5]**:
   - Consider the array `[3, 4, 5]` and the task of finding the 3rd missing element.
   - Again, the sequence is `[1, 2, 3, 4, 5, 6, 7, 8, ...]`.
   - The first two missing elements are `1` and `2`, but `3` is in the array.
   - By the time we account for `3`, `4`, and `5`, the 3rd missing element becomes `6`.

### Key Insight:
The crucial observation here is that the answer increases by the number of elements in the array that are less than or equal to `k`. Each time an element in the array is less than or equal to `k`, it means that particular number is not missing, so we adjust `k` by incrementing it to reflect the next potential missing number.

### Binary Search Approach Best Explanation

https://youtu.be/ulArgbs5aso?si=erm4i2BUG3dxWwI5
