package com.example.cat;

import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;


    public Cat () {

    }
    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talk()", "name Cat = " + name + ", his age = " + age + ", his breed = " + breed + ", his color = " + color);
    }
}
