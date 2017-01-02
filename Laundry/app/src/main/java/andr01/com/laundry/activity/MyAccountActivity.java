package andr01.com.laundry.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import andr01.com.laundry.R;

/**
 * Created by Dony.A.Nuransyah on 21/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class MyAccountActivity extends AppCompatActivity{
 ImageView fotoku;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount);
        fotoku = (ImageView)findViewById(R.id.fotoprofile);

        Glide.with(getApplicationContext())
                .load("https://lh3.googleusercontent.com/-KkpzgerULqk/AAAAAAAAAAI/AAAAAAAAAAA/OMvuKGv_A68/photo.jpg")
                .asBitmap()
                .override(144,144)
                .centerCrop()
                .into(new BitmapImageViewTarget(fotoku) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable rounded = RoundedBitmapDrawableFactory
                        .create(getApplicationContext().getResources(), resource);
                rounded.setCircular(true);
                fotoku.setMaxWidth(28);
                fotoku.setMaxHeight(28);
                fotoku.setImageDrawable(rounded);

            }
        });
    }


}
