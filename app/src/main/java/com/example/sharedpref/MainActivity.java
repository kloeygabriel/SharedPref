package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText name;
    TextView display;
    TextView display2;

    Button show;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editemail);
        name = findViewById(R.id.editname);
        display = findViewById(R.id.txtDisplay1);
        display2 = findViewById(R.id.txtDisplay2);


        show = findViewById(R.id.btnshow);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editemail;
                String editname;


                editemail = email.getText().toString();
                editname = name.getText().toString();


                display.setText("Email: " + editemail);
                display2.setText("Name: " + editemail);


            }


        });

    }
}


