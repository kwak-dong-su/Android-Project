package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button naverBtn, callBtn, galleryBtn, exitBtn;

        naverBtn=findViewById(R.id.naverBtn);
        callBtn=findViewById(R.id.callBtn);
        galleryBtn=findViewById(R.id.galleryBtn);
        exitBtn=findViewById(R.id.exitBtn);

        naverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("네이버로 가기");
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("전화 걸기");
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01094141111"));
                startActivity(intent);
            }
        });

        galleryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("갤러리로 가기");
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
//                Intent intent=new Intent(getApplicationContext(), CalActivity.class); //계산기 페이지로
                startActivity(intent);

            }
        });


        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("끝내기");
                finish();

            }
        });

    }

    public void print(String str){
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show(); // LENGTH_LONG은 길게 띄우기, SHORT는 짧게 띄우기
    }
}
