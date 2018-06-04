package com.example.sunrindiary;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.sunrindiary.R.id.btn;
import static com.example.sunrindiary.R.id.input;

public class MainActivity extends AppCompatActivity {
ArrayList<String> items = new ArrayList<>();
Adapter mAdapter;
ListView list;
EditText inputText;
Button btn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add("ASD");
        list=findViewById(R.id.list);
        inputText=findViewById(R.id.input);

        mAdapter = new Adapter(items);
        content.setAdapter(mAdapter);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inp=inputText.getText().toString();
                items.add(inp);
                mAdapter.notifyDataSetChanged();
                inputText.setText("");
            }
        });
    }
}

테
