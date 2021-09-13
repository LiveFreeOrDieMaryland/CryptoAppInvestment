package com.cryptoApp;

public class stakingData {
  int interest;

  int[] StableInterest = new int[10];
  String[] StableCoins = {
          "USDC",
          "USDT",
          "DAI",
          "Paxos Standard",
          "TrueUSD",
  };
  String[] HighInterestCoin = {
          "PancakeSwap",
          "Bunny Coin",
  };
  int[] VolatileInterest = new int[6];
  String[] VolatileCoins = {
          "Bitcoin",
          "Ethereum",
          "BitcoinCash",
          "XRP",
          "BNB",
          "Stellar Lumens",
          "Cosmos",

  };

  public int getInterest() {
    return interest;
  }
}
