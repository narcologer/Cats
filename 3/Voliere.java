import animals.SizeEnum;
import animals.parent.Animal;

import java.util.HashMap;

public class Voliere<A extends Animal> {
    private HashMap<String, Animal> hashMap = new HashMap<>();
    SizeEnum size;
    public Voliere(SizeEnum size){
        this.size=size;
    }
    public void addAnimal(A animal){
        if (animal.getSize().toString()!=this.size.toString())
            System.out.println(animal.getClass().getName() + " не может быть добавлен");
        else {
            hashMap.put(animal.getName(), animal);
            System.out.println(animal.getClass().getName()+" по имени " + animal.getName() + " добавлен в "+this.getClass().getName());
        }
    }
    public void removeAnimal(String name){
        if (hashMap.containsKey(name)) {
            hashMap.remove(name);
            System.out.println("Из "+this.getClass().getName()+" удалён "+name);
        }
        else
            System.out.println("Нет такого животного");
    }
    public Animal getAnimal(String name){
        if (hashMap.containsKey(name))
            return hashMap.get(name);
        else{
            System.out.println("Нет такого животного");
            return null;
        }
    }
}
