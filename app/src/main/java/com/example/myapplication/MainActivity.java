package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtfirstValue;
    EditText edtsecondValue;

    TextView tvAns;

    Button add , subtract , multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtfirstValue = findViewById(R.id.edtFirstVal);
        edtsecondValue = findViewById(R.id.edtSecondVal);

        tvAns = findViewById(R.id.etAns);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans ;

                firstValue = Integer.parseInt(edtfirstValue.getText().toString());
                secondValue = Integer.parseInt(edtsecondValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Answer is : "+ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans ;

                firstValue = Integer.parseInt(edtfirstValue.getText().toString());
                secondValue = Integer.parseInt(edtsecondValue.getText().toString());

                ans = firstValue - secondValue;

                tvAns.setText("Answer is : "+ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans ;

                firstValue = Integer.parseInt(edtfirstValue.getText().toString());
                secondValue = Integer.parseInt(edtsecondValue.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Answer is : "+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans ;

                firstValue = Integer.parseInt(edtfirstValue.getText().toString());
                secondValue = Integer.parseInt(edtsecondValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Answer is : "+ans);
            }
        });


    }
}