public class Context {
    //strategy par defaut
    private IStrategy iStrategy = new StrategyImp1();
    public void appliquerStrategy(){
        iStrategy.appliquer();
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
