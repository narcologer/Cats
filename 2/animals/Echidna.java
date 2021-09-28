package animals;

import food.Food;

public class Echidna extends Herbivore implements Run{
    public Echidna(int hunger) {
        super(hunger);
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
