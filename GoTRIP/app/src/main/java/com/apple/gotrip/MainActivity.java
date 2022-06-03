package com.apple.gotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextPage;
        final TextView name;

        nextPage=findViewById(R.id.nextBtn1);
        name=findViewById(R.id.inputName);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "확인", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), ChoiceTypeActivity.class); // 여행 타입 선택 페이지로
                intent.putExtra("name", name.getText().toString());
                startActivity(intent);
            }
        });
    }
}
