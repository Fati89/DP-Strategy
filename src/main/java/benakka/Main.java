package benakka;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws Exception{
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> mapStrategy = new HashMap<>();

        while (true){
            System.out.println("Name of strategy: ");
            String str = scanner.nextLine();
            Strategy strategy = mapStrategy.get(str);
            if(strategy==null){
                System.out.println("New stratergy created !");
                strategy = (Strategy) Class.forName("benakka.StrategyImpl"+str).getConstructor().newInstance();
                mapStrategy.put(str, strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }

    }
}
