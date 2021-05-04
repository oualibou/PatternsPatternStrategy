public class App {
    public static void main(String[] args) {
      Context context = new Context();
      context.appliquerStrategy();

      context.setiStrategy(new StrategyImp2());
      context.appliquerStrategy();

      context.setiStrategy(new StrategyImp3());
      context.appliquerStrategy();
    }
}
