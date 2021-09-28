package animals;

import food.Food;

public abstract class Animal {
    protected int hunger;

    protected Animal(int hunger) {
        this.hunger = hunger;
    }

    public boolean chkHunger(){
        if (this.hunger==0)
        {
            System.out.println("Покормите "+this.getClass().getName());
            return false;
        }
        else
        {
            this.hunger--;
            return true;
        }
    }

    public abstract void eat(Food food);
}
