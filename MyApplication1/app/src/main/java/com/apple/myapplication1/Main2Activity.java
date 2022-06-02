package com.apple.myapplication1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //view 객체의 값을 넣어줄 변수를 선언
        Button b1, b2;
        final TextView t1, t2;

        // 안드로이드에서는 자원과 관련된 것은
        // R 클래스가 담당하고 값이 저장된 변수를 가지고 있음
        // R 클래스가 가지고 있는 변수를 가지고 view 객체에 대한 주소를 획득하여 선언된 변수에 저장
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t3);
        t2=findViewById(R.id.t2);


        // b1에 클릭 이벤트를 등록
        // 인터페이스를 따르는 익명클래스의 객체를 입력값으로 넣어줌
        // 생성된 개게가 이벤트 처리를 담당
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //처리 내용을 구현
                Log.d("확인용", "버튼1 클릭");
//                Toast.makeText(Main2Activity.this, "테스트 버튼 클릭");
                String s1 = t1.getText().toString();
                Log.d("입력용", s1);
                String s2 = t2.getText().toString();
                Log.d("입력용", s2);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("확인용","버튼2 클릭");

            }
        });


    }
}
