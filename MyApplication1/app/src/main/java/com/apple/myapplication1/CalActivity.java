package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        Button plusBtn, minusBtn, multiplyBtn, devideBtn, changeImgBtn;
        final TextView num1, num2, resultNum;
        final ImageView image;

        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minusBtn);
        multiplyBtn=findViewById(R.id.multiplyBtn);
        devideBtn=findViewById(R.id.devideBtn);
        changeImgBtn=findViewById(R.id.changeImgBtn);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        resultNum=findViewById(R.id.resultNum);

        image=findViewById(R.id.imageView);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("숫자1", num1.getText().toString());
                Log.d("숫자2", num2.getText().toString());

                resultNum.setText("결과는 ? "+(Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString()))+"");

            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultNum.setText("결과는 ? "+(Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString()))+"");

            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultNum.setText("결과는 ? "+(Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString()))+"");

            }
        });

        devideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultNum.setText("결과는 ? "+(Float.parseFloat(num1.getText().toString())/Float.parseFloat(num2.getText().toString()))+"");

            }
        });

        changeImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setImageResource(R.drawable.carrier_icon);

            }
        });
    }
}
