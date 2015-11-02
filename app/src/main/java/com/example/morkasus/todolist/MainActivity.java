package com.example.morkasus.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private Button okButton;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.tasksList);
        String[] items = {"Apple","banana","grapes"};
        arrayList = new ArrayList<String>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this,R.layout.listitem,R.id.listItem,arrayList);
        listView.setAdapter(adapter);

        okButton = (Button) findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String newItem = textInput.getText().toString();
//                if(!newItem.equals(""))
//                    arrayList.add(newItem);
//                    adapter.notifyDataSetChanged();
//                    textInput.setText("");
                Intent intent = new Intent(MainActivity.this, EnterTaskActivity.class);
                startActivity(intent);
            }
        });

    }


}
