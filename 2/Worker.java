import animals.Animal;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Animal animal){
        animal.produceVoice();
    }
    public void animalOutput(Animal [] animals){
        System.out.println("Имеющиеся животные:");
        for (int i=0 ; i<animals.length; i++) {
            if (i == animals.length - 1)
                System.out.println(animals[i].getClass().getName() + ".");
            else
                System.out.print(animals[i].getClass().getName() + ", ");
        }
    }
}
