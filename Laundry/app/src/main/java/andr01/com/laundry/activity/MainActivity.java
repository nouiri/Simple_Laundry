package andr01.com.laundry.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import andr01.com.laundry.R;
import andr01.com.laundry.spreference.remoteSP;
import andr01.com.laundry.viewmodel.GridMenuAdapter;

public class MainActivity extends Activity{
    GridView grid;

    String[] MenuText = {
            "My Account",
            "My Laundry",
            "Laundry Location",
            "Logout",
            "Exit"
    } ;

    int[] MenuImage = {
            R.drawable.ic_person_black_24dp,
            R.drawable.ic_laundry,
            R.drawable.ic_place_black_24dp,
            R.drawable.ic_directions_run_black_24dp,
            R.drawable.ic_exit_to_app_black_24dp,
    };

    public void logoutUser(){

        // After logout redirect user to Loing Activity
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(i);
        finish();
        remoteSP.saveBol("loginned",false);
        // Staring Login Activity
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        GridMenuAdapter adapter = new GridMenuAdapter(MainActivity.this, MenuText, MenuImage);
        grid=(GridView)findViewById(R.id.gridView1);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (MenuText[position]){
                    case "My Account" : switches(MainActivity.this,MyAccountActivity.class);
                        break;
                    case "My Laundry" : switches(MainActivity.this,MyLaundryActivity.class);
                        break;
                    case "Laundry Location" : switches(MainActivity.this,LocationActivity.class);
                        break;
                    case "Logout" : logoutUser();
                        break;
                    case "Exit" : finish();
                        break;
                }
            }
        });

    }

    public void switches(Context context,Class c) {
        Intent i = new Intent(context,c);
        startActivity(i);
    }
}