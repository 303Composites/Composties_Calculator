package com.example.compositescalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


import androidx.annotation.Nullable;

public class OrderActivity extends Activity  {
    private WebView webView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);



    }


    public void onOnlineOrder(View view) {
        Intent getOnlineOrder = new Intent(this,WebviewActivity.class);
        final int result = 1;
        startActivity(getOnlineOrder);

    }
}

