package com.dat.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Picasso picasso = MyApplication.get(this).getMyAppComponent().picasso();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        picasso.load("http://zoo22.ru/images/stories/fotoalbom_2013/1.png").into(imageView);
    }
}
