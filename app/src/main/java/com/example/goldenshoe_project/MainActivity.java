package com.example.goldenshoe_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[] shoeName = {"New Balance Men's trainer", "Sketchers Women's Trainer", "Adidas Kids' Trainer"};
    String[] shoeDescription = {"New Balance 410 Trainers Black", "Skechers Quick Getaway 12983 Slip-On Sneakers", "KIDS LIFESTYLE Little Racer Shoes"};

    Integer[] imgid = {R.drawable.menstrainers, R.drawable.womenstrainers, R.drawable.kidstrainers};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    lst = (ListView) findViewById(R.id.listView);

    CustomListview customListview = new CustomListview(this, shoeName, shoeDescription, imgid);
    lst.setAdapter(customListview);
    }
}
