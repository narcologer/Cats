package animals;

import food.Food;

public class Fish extends Carnivorous{

    public Fish(int hunger) {
        super(hunger);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
