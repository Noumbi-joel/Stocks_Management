public abstract class SharedAsset implements Asset {
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public SharedAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    public void addCost(double cost){
        totalCost += cost;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //this returns the current market value of this asset
    public abstract double getMarketValue();

    //this returns the profit earned on shares of this asset
    public double getProfit(){
        // calls an abstract getMarketValue
        return getMarketValue() - totalCost;
    }
}
