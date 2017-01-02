package andr01.com.laundry.presenter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.Toast;

import andr01.com.laundry.activity.LoginActivity;
import andr01.com.laundry.spreference.remoteSP;
import andr01.com.laundry.view.LoginView;

/**
 * Created by Dony.A.Nuransyah on 29/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class LoginPresenterImp implements LoginPresenter {
    LoginView view;
    Context context;
    remoteSP remote;
    LoginActivity login;

    public LoginPresenterImp(LoginView View,Context context) {
        login = new LoginActivity();
        this.context = context;
        this.view=View;
    }

    @Override
    public void login(String username, String password) {
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin")){
            view.valid();
        }
        else {
            view.refuse();
        }
    }

    @Override
    public boolean haslogin(Class to)throws NullPointerException {
        boolean loginned=false;
        if (remoteSP.getBol("loginned")) {
            Toast.makeText(context, "has loginned = "+String.valueOf(remoteSP.getBol("loginned")), Toast.LENGTH_LONG).show();
            Intent i = new Intent(context, to);
            context.startActivity(i);
            return true;
        }
        return loginned;
    }

    @Override
    public void forgetpass(Context c) {
        AlertDialog.Builder alert = new AlertDialog.Builder(c);

        alert.setTitle("Lupa Password");
        alert.setMessage("Masukan email");

// Set an EditText view to get user input
        final EditText inputemail = new EditText(c);
        alert.setView(inputemail);

        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
                // Do something with value!
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
            }
        });

        alert.show();
    }
}
