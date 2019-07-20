package com.saiproject.app11;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayoutHorizontal;
    ImageView imgAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        linearLayoutHorizontal = findViewById(R.id.linearLayoutHorizontal);
        imgAnimal = findViewById(R.id.imgAnimal);

        for(int index = 0 ; index < Animal.animalNames.length; index++){

            final int i = index; //Since variable to be used inside class needs to be final
            final ImageView imgView = new ImageView(this);
            imgView.setImageResource(Animal.animalImages[index]);
            setLayoutParams(imgView);
            imgView.setPadding(100,100,100,100);

            imgView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    imgAnimal.setImageResource(Animal.animalImages[i]);
                    setLayoutParams(imgAnimal);
                    Toast.makeText(MainActivity.this,"This is " + Animal.animalNames[i],Toast.LENGTH_SHORT).show();


                }
            });


            linearLayoutHorizontal.addView(imgView);

        }





    }


    public ImageView setLayoutParams(ImageView imgView){


        imgView.setLayoutParams(new LinearLayout.LayoutParams(1000,1000));
        return imgView;


    }


}
