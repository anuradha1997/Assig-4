package com.example.anuradha.assig_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    RadioGroup r1;
    RadioButton r2,r3;
    String city[];
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.eg1);
        b1= (Button) findViewById(R.id.bg1);
        e2= (EditText) findViewById(R.id.eg2);
        sp= (Spinner) findViewById(R.id.sg);
        r2= (RadioButton) findViewById(R.id.rb1);
        r3= (RadioButton) findViewById(R.id.rb2);
        r1= (RadioGroup) findViewById(R.id.rg1);
        city=getResources().getStringArray(R.array.data);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);
        sp.setAdapter(ad);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this,Second_activity.class);
           String b=e2.getText().toString();
            String a= e1.getText().toString();
            String c=sp.getSelectedItem().toString();
            i.putExtra("no",b);
            i.putExtra("name_key",a);
            i.putExtra("city",c);
            if(r2.isChecked())
            {
             String o=r2.getText().toString();
                i.putExtra("male",o);
            }
            else
            {
                String f=r3.getText().toString();
                i.putExtra("female",f);
            }
            startActivity(i);

           }
    });}
}
