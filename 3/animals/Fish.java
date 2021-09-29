package animals;

import animals.behavior.Swim;
import animals.parent.Carnivorous;
import food.parent.Food;

public class Fish extends Carnivorous implements Swim {
    public Fish(int hunger, String name, SizeEnum size) {
        super(hunger, name, size);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void animalSwim() {
        if (this.chkHunger())
            System.out.println("Рыба плавает");
    }
}
