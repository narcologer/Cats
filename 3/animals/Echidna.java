package animals;

import animals.behavior.Run;
import animals.parent.Herbivore;
import food.parent.Food;

public class Echidna extends Herbivore implements Run {
    public Echidna(int hunger, String name, SizeEnum size) {
        super(hunger, name, size);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void animalRun() {
        if(this.chkHunger())
            System.out.println("Ехидна бежит");
    }
}
