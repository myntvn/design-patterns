package behavioral.strategy;

import behavioral.strategy.duck.Duck;
import behavioral.strategy.duck.MallardDuck;
import behavioral.strategy.duck.ModelDuck;
import behavioral.strategy.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
