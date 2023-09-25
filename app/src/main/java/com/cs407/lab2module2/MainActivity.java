package com.cs407.lab2module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addInts(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editTextInt1); // get first integer
        EditText editText2 = (EditText) findViewById(R.id.editTextInt2); // get second integer
        int int1 = 0;
        int int2 = 0;
        int good = 1;
        try {
            int1 = Integer.parseInt(editText1.getText().toString());
            int2 = Integer.parseInt(editText2.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, "Must Use Integers in Text Field", Toast.LENGTH_LONG).show();
            good = 0;
        }
        if(good == 1) {
            int out = int1 + int2;
            goToActivity(""+out);
        }
    }

    public void subInts(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editTextInt1); // get first integer
        EditText editText2 = (EditText) findViewById(R.id.editTextInt2); // get second integer
        int int1 = 0;
        int int2 = 0;
        int good = 1;
        try {
            int1 = Integer.parseInt(editText1.getText().toString());
            int2 = Integer.parseInt(editText2.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, "Must Use Integers in Text Field", Toast.LENGTH_LONG).show();
            good = 0;
        }
        if(good == 1) {
            int out = int1 - int2;
            goToActivity(""+out);
        }
    }

    public void multInts(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editTextInt1); // get first integer
        EditText editText2 = (EditText) findViewById(R.id.editTextInt2); // get second integer
        int int1 = 0;
        int int2 = 0;
        int good = 1;
        try {
            int1 = Integer.parseInt(editText1.getText().toString());
            int2 = Integer.parseInt(editText2.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, "Must Use Integers in Text Field", Toast.LENGTH_LONG).show();
            good = 0;
        }
        if(good == 1) {
            int out = int1 * int2;
            goToActivity(""+out);
        }
    }

    public void divInts(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editTextInt1); // get first integer
        EditText editText2 = (EditText) findViewById(R.id.editTextInt2); // get second integer
        int int1 = 0;
        int int2 = 0;
        int good = 1;
        try {
            int1 = Integer.parseInt(editText1.getText().toString());
            int2 = Integer.parseInt(editText2.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(MainActivity.this, "Must Use Integers in Text Field", Toast.LENGTH_LONG).show();
            good = 0;
        }
        if(int2 == 0) {
            Toast.makeText(MainActivity.this, "Divide by Zero Error", Toast.LENGTH_LONG).show();
        }
        else if(good == 1) {
            double d1 = int1;
            double d2 = int2;
            double out = d1/d2;
            goToActivity("" + out);
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorOutput.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }

}