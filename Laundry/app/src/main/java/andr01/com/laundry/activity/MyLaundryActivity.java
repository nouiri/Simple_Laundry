package andr01.com.laundry.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import andr01.com.laundry.R;

/**
 * Created by Dony.A.Nuransyah on 21/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class MyLaundryActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylaundry);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("OnProcess"));
        tabLayout.addTab(tabLayout.newTab().setText("Finish"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
        @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getPosition();
                tab.getText();



           // getFragmentManager()
             //       .beginTransaction().replace(R.id.where_the_tab_contents_go, f).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

