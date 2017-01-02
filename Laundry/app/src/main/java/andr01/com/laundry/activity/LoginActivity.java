package andr01.com.laundry.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import andr01.com.laundry.R;
import andr01.com.laundry.presenter.LoginPresenter;
import andr01.com.laundry.presenter.LoginPresenterImp;
import andr01.com.laundry.spreference.remoteSP;
import andr01.com.laundry.view.LoginView;

/**
 * Created by Dony.A.Nuransyah on 21/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class LoginActivity extends AppCompatActivity implements LoginView{


    String username="admin",password="admin";
    EditText user,pass;
    TextView loginButton,forgetButton;
    LoginPresenter presenter;
    private ListView customListView;
    remoteSP remote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
        presenter = new LoginPresenterImp(LoginActivity.this,LoginActivity.this);
        if(presenter.haslogin(MainActivity.class))finish();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(user.getText().toString(),pass.getText().toString());
            }
        });
        forgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.forgetpass(LoginActivity.this);
            }
        });
    }


    @Override
    public void valid() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        remote.saveBol("loginned",true);
        Toast.makeText(LoginActivity.this,String.valueOf(remoteSP.getBol("loginned")),Toast.LENGTH_LONG).show();
        finish();
    }

    @Override
    public void refuse() {
        Toast.makeText(LoginActivity.this,"Password Salah \n" +
                "Gunakan Lupa Password",Toast.LENGTH_LONG).show();
    }

    public void init(){
        loginButton = (TextView) findViewById(R.id.buttonLogin);
        forgetButton = (TextView)findViewById(R.id.lupapassword);
        user=(EditText) findViewById(R.id.input_user);
        pass=(EditText) findViewById(R.id.input_password);
        remote = new remoteSP(getApplicationContext());
    }


}
