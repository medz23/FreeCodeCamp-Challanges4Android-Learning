package com.example.registersimplu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFunction(View view){
        EditText fName = findViewById(R.id.fName);
        EditText lName = findViewById(R.id.lName);
        EditText email = findViewById(R.id.email);

        TextView fNameT = findViewById(R.id.fNameT);
        TextView lNameT = findViewById(R.id.lNameT);
        TextView emailT = findViewById(R.id.emailT);

        fNameT.setText("First Name: " + fName.getText().toString());
        lNameT.setText("Last Name: " + lName.getText().toString());
        emailT.setText("Email: " + email.getText().toString());
    }
}