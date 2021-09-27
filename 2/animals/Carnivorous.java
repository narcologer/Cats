package animals;

import food.Food;
import food.Grass;

public class Carnivorous extends Animal {

    protected Carnivorous(int hunger) {
        super(hunger);
    }

    public void eat(Food food){
        if (food instanceof Grass)
        {
            System.out.println("Хищники не едят травы");
        }
        else
        {
            this.hunger++;
            System.out.println(this.getClass().getName()+" съел "+food.getClass().getName()+". ");
        }
    }
}
