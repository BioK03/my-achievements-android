package com.example.myachievements;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSearch = (TextView) findViewById(R.id.button2);
        Typeface fa = Typeface.createFromAsset(getAssets(), "fonts/fontawesome.ttf");
        btnSearch.setTypeface(fa);
    }

    public void profileview(View view)
    {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
