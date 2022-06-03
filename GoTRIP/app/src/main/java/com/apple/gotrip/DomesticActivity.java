package com.apple.gotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DomesticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        ImageButton dom1, dom2, dom3;
        dom1=findViewById(R.id.domestic1);
        dom2=findViewById(R.id.domestic2);
        dom3=findViewById(R.id.domestic3);

        dom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "N 서울타워", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g294197-d1169465-Reviews-N_Seoul_Tower-Seoul.html"));
                startActivity(intent);

            }
        });

        dom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "경복궁", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g294197-d324888-Reviews-Gyeongbokgung_Palace-Seoul.html"));
                startActivity(intent);

            }
        });

        dom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "우도", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g297885-d1776326-Reviews-Udo-Jeju_Jeju_Island.html"));
                startActivity(intent);

            }
        });
    }
}
