package com.apple.gotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AbroadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad);

        ImageButton abr1, abr2, abr3;
        abr1=findViewById(R.id.abroad1);
        abr2=findViewById(R.id.abroad2);
        abr3=findViewById(R.id.abroad3);

        abr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "에펠탑", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g187147-d188151-Reviews-Eiffel_Tower-Paris_Ile_de_France.html"));
                startActivity(intent);

            }
        });

        abr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "마추픽추", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g294318-d668949-Reviews-Santuario_Historico_de_Machu_Picchu-Machu_Picchu_Sacred_Valley_Cusco_Region.html"));
                startActivity(intent);

            }
        });

        abr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "우유니 사막", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.kr/Attraction_Review-g317033-d316550-Reviews-Salar_de_Uyuni-Uyuni_Potosi_Department.html"));
                startActivity(intent);

            }
        });
    }
}
