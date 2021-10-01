package animals.parent;

import animals.SizeEnum;
import animals.WrongFoodException;
import food.parent.Food;
import food.Meat;

public class Herbivore extends Animal {

    protected Herbivore(int hunger, String name, SizeEnum size) {
        super(hunger, name, size);
    }

    public void eat(Food food){
        try {
            if (food instanceof Meat) {
                throw new WrongFoodException("Травоядные не едят мяса");
            } else {
                hunger++;
                System.out.println(this.getClass().getName() + " съел " + food.getClass().getName() + ". ");
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
}
