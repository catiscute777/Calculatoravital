package com.example.calculatoravital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed;double  number1;double number2;String sign;String st;String s;
    Button btn ;    Button btn1 ;    Button btn2 ;    Button btn3 ;    Button btn4 ;    Button btn5;    Button btn6 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        ed = findViewById(R.id.edt);btn6 = findViewById(R.id.btn6);btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);btn2 = findViewById(R.id.btn2);btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);btn5 = findViewById(R.id.btn5);
    }

    public void minus(View view)
    {
        sign = "-";
        st=ed.getText().toString();
        number1 = Double.parseDouble(st);
        ed.getText().clear();
    }


    public void add(View view)
    {
        sign = "+";
        st=ed.getText().toString();
        number1 = Double.parseDouble(st);
        ed.getText().clear();
    }

    public void divide(View view) {
        sign = "/";
        st=ed.getText().toString();
        number1 = Double.parseDouble(st);
        ed.getText().clear();
    }

    public void multip(View view) {
        sign = "*";
        st=ed.getText().toString();
        number1 = Double.parseDouble(st);
        ed.getText().clear();
    }

    public void end(View view) {
        String st = ed.getText().toString();
        number2=Double.parseDouble(st);
        if(sign.equals("+")){
            number1 = number1+number2;
            st =""+number1;}
        if(sign.equals("-")){
            number1 = number1-number2;
        st =""+number1;}
        if(sign.equals("*")){
            number1 = number1*number2;
        st =""+number1;}
        if(sign.equals("/")) {
            number1 = number1 / number2;
            st =""+number1;}
        ed.setText(st);
        s= st;
    }

    public void credits(View view) {

        Intent si = new Intent(this, Activity2.class);
        si.putExtra("n",s);
        startActivity(si);
    }

    public void clear(View view) {
        ed.getText().clear();
        st="";
        number1=0;
        number2=0;
        s="0";
        sign="";
    }
}