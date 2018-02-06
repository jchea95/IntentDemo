package com.example.juliechea.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by juliechea on 2/1/18.
 */

public class Activity2 extends AppCompatActivity{

    private ImageView superMoonImg;
    private ImageView waterfallImg;

    private int imgID;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2); // links to new layout


        superMoonImg = findViewById(R.id.superMoonIMG);
        waterfallImg = findViewById(R.id.waterfallIMG);

        superMoonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgID = R.drawable.supermoon;
                finish();
            }
        });


        waterfallImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgID = R.drawable.waterfall;
                finish();
            }
        });

    }

    // response to ActivityForResult
    @Override
    public void finish(){
        Intent intent = new Intent();
        intent.putExtra("imageID", imgID);

        setResult(RESULT_OK, intent);
        super.finish();

    }

}
