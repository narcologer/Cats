package animals;

import food.Food;

public abstract class Animal {
    protected int hunger;

    protected Animal(int hunger) {
        this.hunger = hunger;
    }

    public abstract void eat(Food food);
}
