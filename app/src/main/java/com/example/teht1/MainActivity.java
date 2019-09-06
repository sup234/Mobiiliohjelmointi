package com.example.teht1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    /*ArrayList<String> list = new ArrayList<String>();
    EditText edittext = findViewById(R.id.edittext1);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn1);



    }
   /*private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            saveMessage();
        }
    };

    private void saveMessage() {
        list.add(edittext.getText().toString());
    }*/
}
