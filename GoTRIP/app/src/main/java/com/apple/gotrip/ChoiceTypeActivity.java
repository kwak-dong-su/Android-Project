package com.apple.gotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChoiceTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_type);

        TextView textView= findViewById(R.id.textView3);
        Button domestic, abroad, hitrip;

        domestic=findViewById(R.id.domBtn);
        abroad=findViewById(R.id.abrBtn);
        hitrip=findViewById(R.id.hitripBtn);


        Intent intent=getIntent();
        String name=intent.getStringExtra("name");

        textView.setText(name+"님,");

        domestic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "국내 여행", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), DomesticActivity.class); // 국내 여행 페이지로
                startActivity(intent);

            }
        });

        abroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "해외 여행", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), AbroadActivity.class); // 국내 여행 페이지로
                startActivity(intent);

            }
        });

        hitrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HiTRIP으로", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), WebViewActivity.class); // 하이트립 WebView
                startActivity(intent);
            }
        });
    }
}
