package com.example.anshulsharma.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView chacha=findViewById(R.id.chacha);
        chacha.animate().translationXBy(1000).translationYBy(1000).rotationBy(3600).setDuration(2000);

        ImageView chachi=findViewById(R.id.chachi);
        chachi.animate().alpha(0).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView chacha=findViewById(R.id.chacha);
        chacha.setTranslationX(-1000);
        chacha.setTranslationY(-1000);
    }
}
