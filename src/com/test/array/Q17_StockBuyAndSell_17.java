package com.test.array;

public class Q17_StockBuyAndSell_17 {
	// 10 is a minimum price and  80 is a selling price = 80-10 =70;
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80};
		
		int buyStock = buyStock(arr);
		System.out.println(buyStock);
		
		
	}
	
	public static int buyStock(int[] prices) {
		
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}else if(prices[i] - minPrice >  maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		
		return maxProfit;
	}
	
	
}
