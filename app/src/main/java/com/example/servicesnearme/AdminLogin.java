package com.example.servicesnearme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLogin extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alogin);

        Button loginbtn = (Button) findViewById(R.id.aloginbutton);
        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.aloginbutton:
                Intent i = new Intent(AdminLogin.this, AdminRequest.class);
                startActivity(i);
                break;
        }
    }
}