package com.qianfeng.temp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试GitHub提交代码
        textView = (TextView) findViewById(R.id.tv);
        textView.setText("Hello GitHub");
    }
}
