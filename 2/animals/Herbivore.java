package animals;

import food.Food;
import food.Meat;

public class Herbivore extends Animal {

    protected Herbivore(int hunger) {
        super(hunger);
    }

    public void eat(Food food){
        if (food instanceof Meat)
        {
            System.out.println("Травоядные не едят мяса");
        }
        else
        {
            hunger++;
            System.out.println(this.getClass().getName()+" съел "+food.getClass().getName()+". ");
        }
    }
}
