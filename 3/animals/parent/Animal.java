package animals.parent;

import animals.SizeEnum;
import food.parent.Food;

public abstract class Animal {
    protected int hunger;
    private String name;
    private SizeEnum size;

    public abstract void eat(Food food);

    protected Animal(int hunger, String name, SizeEnum size) {
        this.hunger = hunger;
        this.name=name;
        this.size=size;
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

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return animal.name.equals(name) &&
                animal.size.toString().equals(size.toString());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }
}
