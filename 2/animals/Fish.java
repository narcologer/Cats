package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim{

    public Fish(int hunger) {
        super(hunger);
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
