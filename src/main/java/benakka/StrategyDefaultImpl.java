package benakka;

public class StrategyDefaultImpl implements Strategy{
    @Override
    public void operationStrategy() {
        System.out.println("---------- DEFAULT ----------");
    }
}
