public class MutualFunds extends SharedAsset {
    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
