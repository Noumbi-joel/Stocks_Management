public class CodeTest {
    public static void main(String[] args){
        Asset asset = new MutualFunds("Amazon", 300);
        System.out.print(asset.getMarketValue());
    }
}
