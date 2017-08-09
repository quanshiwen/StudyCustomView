package com.lwen.studycustomview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lwen.studycustomview.studymethods.DrawxxxAndPaintView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
       DrawxxxAndPaintView dap_view = (DrawxxxAndPaintView) findViewById(R.id.dap_view);

    }
}
