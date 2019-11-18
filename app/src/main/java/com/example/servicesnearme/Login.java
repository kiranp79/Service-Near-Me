package com.example.servicesnearme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signupbtn = (Button) findViewById(R.id.signupbutton);
        signupbtn.setOnClickListener(this);

        Button changepassbtn = (Button) findViewById(R.id.changepass);
        changepassbtn.setOnClickListener(this);
        Button loginbtn = (Button) findViewById(R.id.loginbutton);
        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.loginbutton:
                Intent i = new Intent(Login.this, Dashboard.class);
                startActivity(i);
                break;
            case R.id.signupbutton:
                Intent s = new Intent(Login.this, SignUp.class);
                startActivity(s);
                break;
            case R.id.changepass:
                Intent c = new Intent(Login.this, ChangePassword.class);
                startActivity(c);
                break;
        }
    }
}