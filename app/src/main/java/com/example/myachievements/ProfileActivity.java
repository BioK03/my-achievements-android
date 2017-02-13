package com.example.myachievements;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.profilepicture);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap);

        ImageView circularImageView = (ImageView)findViewById(R.id.circleView);
        circularImageView.setImageBitmap(circularBitmap);
    }
}
