package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(20, "Мурзик", "Шпиц", "Зелёный");
        myCat.talk();

        Cat igor = new Cat(20, "Мурзик", "Британец", "Коричневый");
        igor.talk();

        Cat oleg = new Cat();
        oleg.age = 10;
        oleg.name = "Oleg";
        oleg.breed = "Oleg";
        oleg.color = "Oleg";
        oleg.talk();
    }
}