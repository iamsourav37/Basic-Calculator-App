package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirst,etSecond;
    TextView tvResult;
    Button btnAdd,btnSub,btnMult,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = (EditText) findViewById(R.id.etFirstValue);
        etSecond = (EditText)findViewById(R.id.etSecondValue);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub =(Button)  findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);


    }

    public void btnAdd(View view) {
        try{
            int a = Integer.parseInt(etFirst.getText().toString());
            int b = Integer.parseInt(etSecond.getText().toString());
            int c = a+b;
            tvResult.setText(a+"+"+b+" = "+c);
        }catch (Exception e){
            tvResult.setText("Something Wrong. ->"+e.getMessage());
        }
    }

    public void btnSub(View view) {
        try{
            int a = Integer.parseInt(etFirst.getText().toString());
            int b = Integer.parseInt(etSecond.getText().toString());
            int c = a-b;
            tvResult.setText(a+"-"+b+" = "+c);
        }catch (Exception e){
            tvResult.setText("Something Wrong. ->"+e.getMessage());
        }

    }
    public void btnMult(View view) {
        try{
            int a = Integer.parseInt(etFirst.getText().toString());
            int b = Integer.parseInt(etSecond.getText().toString());
            int c = a*b;
            tvResult.setText(a+"*"+b+" = "+c);
        }catch (Exception e){
            tvResult.setText("Something Wrong. ->"+e.getMessage());
        }

    }
    public void btnDiv(View view) {
        try{
            int a = Integer.parseInt(etFirst.getText().toString());
            int b = Integer.parseInt(etSecond.getText().toString());
            int c = a/b;
            tvResult.setText(a+"/"+b+" = "+c);
        }catch (Exception e){
            tvResult.setText("Something Wrong. ->"+e.getMessage());
        }

    }
}
