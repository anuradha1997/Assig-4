package com.example.anuradha.assig_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Second_activity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        t1= (TextView) findViewById(R.id.tv1);
        Bundle b=getIntent().getExtras();
        String a=b.getString("name_key");
        String c=b.getString("no");
        String o=b.getString("city");
        String h=b.getString("male");
        String j=b.getString("female");
        Toast.makeText(this, "YOU ARE SUCCESSFULLY REGISTERED AS KIET TEACHER:- ", Toast.LENGTH_LONG).show();
        t1.setText("Name is-"+a+"\n"+"Mobile no is-"+c+"\n"+"city is-"+o+"\n"+"Gender is-"+j);

    }
}
