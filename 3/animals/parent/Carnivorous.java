package animals.parent;

import animals.SizeEnum;
import animals.WrongFoodException;
import food.parent.Food;
import food.Grass;

public class Carnivorous extends Animal {

    protected Carnivorous(int hunger, String name, SizeEnum size) {
        super(hunger, name, size);
    }

    public void eat(Food food){
        try {
            if (food instanceof Grass) {
                throw new WrongFoodException("Хищники не едят травы");
            } else {
                this.hunger++;
                System.out.println(this.getClass().getName() + " съел " + food.getClass().getName() + ". ");
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
}
