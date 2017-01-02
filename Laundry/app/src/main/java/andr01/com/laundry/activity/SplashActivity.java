package andr01.com.laundry.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import andr01.com.laundry.spreference.remoteSP;

/**
 * Created by Dony.A.Nuransyah on 01/01/17.
 * Email : dony.nuransyah@gmail.com
 */


public class SplashActivity extends AppCompatActivity {
    remoteSP remote;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        remote = new remoteSP(getApplicationContext());
        Handler h = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if(remote.getBol("loginned")){
                    Intent i = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }else {
                    Intent i = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        };
        h.sendEmptyMessageDelayed(0, 1500); // 1500 is time in miliseconds
    }
}
