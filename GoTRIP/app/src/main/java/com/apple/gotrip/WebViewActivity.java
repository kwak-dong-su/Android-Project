package com.apple.gotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webview=findViewById(R.id.hitripWebView);

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

        webview.loadUrl("http://ec2-3-34-145-18.ap-northeast-2.compute.amazonaws.com:8080/trip/main.jsp");
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
