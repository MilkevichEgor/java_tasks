package org.example.interview.tasks;

public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {

	int[] prices = {7,1,5,3,6,4};

	BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
	System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));

  }

  public int maxProfit(int[] prices) {

	int min[] = new int[prices.length];
	int max[] = new int[prices.length];
	min[0] = prices[0];
	max[prices.length - 1] = prices[prices.length - 1];

	for (int i = 1; i < prices.length; i++) {
	  min[i] = Math.min(prices[i], min[i - 1]);
	}

	for (int i = prices.length - 1 - 1; i >= 0; i--) {
	  max[i] = Math.max(prices[i], max[i + 1]);
	}

	int result = 0;

	for (int i = 0; i < prices.length; i++) {
	  result = Math.max(max[i] - min[i], result);
	}

	return result;
  }
}
