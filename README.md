## [#121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
Your goal will be to determine the most profitable way to buy and sell a single stock whose value fluctuates daily.

<details>
  <summary>Hint #1</summary>
  
  Brute force - Consider the buy price for each day, then consider how much profit can be made selling on each subsequent day.
  
</details>

<details>
  <summary>Hint #2</summary>
  
  Optimize - This can be done in a single pass through the array, for a time complexity of O(n).
  
</details>

<details>
  <summary>Hint #3</summary>
  
  Optimize - We only really need to be concerned with two numbers: The lowest buy price, and the greatest profit.
  
</details>
