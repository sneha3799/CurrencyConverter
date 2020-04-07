package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter(View view){
        EditText a= (EditText) findViewById(R.id.amount);

        Double dollars= Double.parseDouble(a.getText().toString());
        Double i= dollars* 71.69;

        Toast.makeText(MainActivity.this,"₹" + i.toString(),Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
