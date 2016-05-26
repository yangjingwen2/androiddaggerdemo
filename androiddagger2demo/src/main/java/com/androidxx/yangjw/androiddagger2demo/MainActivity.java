package com.androidxx.yangjw.androiddagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserBean userBean;//此处不能是private修饰符
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DaggerUserComponent类是自动生成的。此句话的含义表示使用Dagger注入MainActivity中的userBean对象。
        DaggerUserComponent.create().inject(this);
    }

    public void click(View view) {
        Toast.makeText(MainActivity.this, userBean.getName(), Toast.LENGTH_SHORT).show();
    }
}
