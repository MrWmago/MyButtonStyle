package com.example.xw.mybuttonstyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_dianji,tv_xuanze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_dianji = (TextView) findViewById(R.id.tv_dianji);
        tv_xuanze = (TextView) findViewById(R.id.tv_xuanze);

        tv_dianji.setOnClickListener(this);
        tv_xuanze.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_dianji:
                break;
            case R.id.tv_xuanze:
                if (tv_xuanze.isSelected()){
                    tv_xuanze.setSelected(false);
                }else {
                    tv_xuanze.setSelected(true);
                }
                break;
            default:
                break;
        }
    }
}
