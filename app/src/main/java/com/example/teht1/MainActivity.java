package com.example.teht1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //comment
    ArrayList<String> list = new ArrayList<>();
    EditText edittext = findViewById(R.id.myEditText);
    String message;
    Button btnSave = (Button)findViewById(R.id.btn1);
    Button btnDone = (Button)findViewById(R.id.btn2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSave.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View v) {
                saveMessage();
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivity2();
            }
        });

    }


    private void saveMessage() {
        if (edittext.length() < 3 || edittext.length() > 15) {
            message = "Merkkijonon pituus oltava 3 - 15!";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

        }

        else {
            list.add(edittext.getText().toString());
            message = "Lisätty listaan!";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }


    }

    private void goToActivity2() {
        Intent intent = new Intent(MainActivity.this, ShowList.class);
        intent.putStringArrayListExtra("list", list);
        startActivity(intent);

    }
}
