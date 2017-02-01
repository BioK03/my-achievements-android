package com.example.myachievements;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnSearch;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] prenoms = new String[]{
            "Damien Claras", "Bertrand Choubert"
        };

        btnSearch = (TextView) findViewById(R.id.searchButton);
        listView = (ListView) findViewById(R.id.listView);

        Typeface fa = Typeface.createFromAsset(getAssets(), "fonts/fontawesome.ttf");
        btnSearch.setTypeface(fa);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        listView.setAdapter(adapter);
    }

    public void profileview(View view)
    {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
