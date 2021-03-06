package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        webview=findViewById(R.id.webview1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "웹 사이트로 이동", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ec2-43-200-2-85.ap-northeast-2.compute.amazonaws.com:8080/trip/main.jsp"));
                startActivity(intent);
            }
        });

        webview.setWebViewClient(new TripClient());
        // webView에 넣어줄 객체를 하나 지정
        // url을 끼워 넣어주는 객체: WebviewClient
        // 사이트를 액티비티에 끼워 넣었을 때, 여러 설정을 따로 해주어야 한다.
        // 여러 설정만을 담당하는 객체를 사용한다.
        WebSettings webSet=webview.getSettings();
        webSet.setJavaScriptEnabled(true);
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        webSet.setAllowContentAccess(true);
        webSet.setAppCacheEnabled(true);
        webSet.setDomStorageEnabled(true);
        webSet.setUseWideViewPort(true);
        webSet.setAllowFileAccess(true);
        webSet.setAllowFileAccessFromFileURLs(true);

        webview.loadUrl("http://ec2-43-200-2-85.ap-northeast-2.compute.amazonaws.com:8080/trip/main.jsp");

    }
}

class TripClient extends WebViewClient
{
    //오버라이드

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return super.shouldOverrideUrlLoading(view, request);
    }
}