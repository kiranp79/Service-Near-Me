package com.example.servicesnearme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfessionalSignUp extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psignup);

        Button loginbtn = (Button) findViewById(R.id.psignupbutton);
        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(ProfessionalSignUp.this, ProfessionalLogin.class);
        startActivity(i);

    }
}
