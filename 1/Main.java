package com.company;

import com.company.model.Kotik;

public class Main {

    static void compareMeows(Kotik x, Kotik y){
        String result = x.getName()+" и "+y.getName();
        if (x.getMeow().equals(y.getMeow())) {
            result+=" говорят одинаково";
        }
        else
        {
            result+=" говорят по-разному";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
	Kotik a = new Kotik();
	a.liveAnotherDay();
	Kotik b = new Kotik(75,"Огнегрив",6075,"ШШШ");
	b.liveAnotherDay();
	compareMeows(a,b);
	System.out.println("Всего создано "+Kotik.getCount()+" котов");
    }
}
