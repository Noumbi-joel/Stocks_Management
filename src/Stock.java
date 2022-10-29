public class Stock extends SharedAsset {
    private int totalShares;

    public Stock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
