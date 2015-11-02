package com.example.morkasus.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterTaskActivity extends AppCompatActivity {

    private EditText taskEditText;
    private Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_task);
        taskEditText = (EditText) findViewById(R.id.taskEditText);
        addButton = (Button) findViewById(R.id.addTaskButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = taskEditText.getText().toString();
                if(!task.equals("")){
//                    Intent intent = new Intent(EnterTaskActivity.this, MainActivity.class);
//                    intent.putExtra("EXTRA_MESSAGE", task);
//                    startActivity(intent);
                    Toast.makeText(EnterTaskActivity.this,task,Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
