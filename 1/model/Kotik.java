package com.company.model;

import java.util.Random;

public class Kotik {

    private static  int count;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int hunger;

    public Kotik(int prettiness, String name, int weight, String meow) {
        count++;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.hunger=5;
        System.out.println("Создан кот "+this.name+" с весом в "+this.weight+" грамм.");
    }

    public Kotik(){
        count++;
        this.setPrettiness(100);
        this.setName("Ирочка");
        this.setWeight(5000);
        this.setMeow("Мяу");
        this.hunger=5;
        System.out.println("Создан кот "+this.name+" с весом в "+this.weight+" грамм.");
    }

    public static int getCount() {
        return count;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void sayMeow(){
        System.out.println(this.getName()+" говорит "+this.getMeow()+".");
        this.hunger--;
    }

    public void sleep(){
        System.out.println(this.getName()+" спал весь день и видел хорошие сны.");
        this.hunger--;
    } //дальше будут методы boolean, эти два для того, чтобы поболее разнообразить жизнь кота

    public boolean breakPlate(){
        Random rand = new Random();
        int dice = rand.nextInt(5);
        if (dice>2){
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean chaseMouse(){
        Random rand = new Random();
        int dice = rand.nextInt(2);
        if (dice==1){
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean wentOnAdventures(){
        Random rand = new Random();
        int dice = rand.nextInt(3);
        if (dice==2)
            return true;
        else
            return false;
 }

    public boolean crazyOut(){
        Random rand = new Random();
        int dice = rand.nextInt(6);
        if (dice<2)
            return true;
        else
            return false;
    }

    public boolean watchTv(){
        Random rand = new Random();
        int dice = rand.nextInt(6);
        if (dice>2)
            return true;
        else
            return false;
    }

    public boolean chkHunger(){
        if (this.hunger==0)
            return false;
        else
            return true;
    }

    public void eat(int feed){
        this.hunger+=feed;
        System.out.println("Вы покормили "+this.getName()+" "+feed+" единицами сытости.");
    }

    public void eat(int feed, String food){
        this.hunger+=feed;
        System.out.println(this.getName() + " съел следующую еду: " + food + ", в " +feed+" единиц сытости");
    }

    public void eat(){
        this.eat(2,"рыба");
    }

    public void liveAnotherDay(){
        boolean a; //т.е action
        int d = 1;
        Random rand = new Random();
        while (d<=24)
        {
            System.out.print(d+": ");
            if (!this.chkHunger()){
                int variant = rand.nextInt(3);
                switch (variant)
                {
                    case 0:
                        this.eat();
                        break;
                    case 1:
                        this.eat(5);
                        break;
                    case 2:
                        this.eat(3, "Молоко");
                        break;
                }
            }
            else {
                int today = rand.nextInt(5);
                switch (today){
                    case 0:
                        a=this.breakPlate();
                        if (a)
                        {
                            System.out.println(this.getName() + " залез в шкаф, нашел там кусочек мяса в 1 единицу сытости и случайно что-то разбил");
                            this.hunger += 1;
                        }
                        else
                            this.sleep();
                        break;
                    case 1:
                        a= this.chaseMouse();
                        if (a)
                        {
                            System.out.println(this.getName() + " поймал мышь, съел её и получил 2 единицы сытости");
                            this.hunger += 2;
                        }
                        else
                        {
                            System.out.println(this.getName() +" не удалось поймать мышь.");
                            this.hunger--;
                        }
                        break;
                    case 2:
                         a =this.wentOnAdventures();
                         if (a){
                             System.out.println(this.getName()+" отсутствовал сегодня весь день. Наверное, уходил искать приключения.");
                             this.hunger=0;
                         }
                         else
                             this.sleep();
                        break;
                    case 3:
                        a=this.crazyOut();
                        if (a){
                            System.out.println(this.getName()+ " носился сегодня как ракета и очень устал.");
                            if (this.hunger<3)
                                this.hunger=0;
                            else
                                this.hunger-=3;
                        }
                        else
                            this.sayMeow();
                        break;
                    case 4:
                        a= this.watchTv();
                        if (a){
                            System.out.println(this.getName()+" смотрел сегодня телевизор. Ему наверное понравилось.");
                            this.hunger--;
                        }
                        else
                            this.sleep();
                        break;
                }
            }
            d++;
        }
    }
}
