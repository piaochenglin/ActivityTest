package com.klip.android.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_layout);
        ButterKnife.bind(this);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "firstactivity", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @OnClick(R.id.button)
    public void showToast() {
        Toast.makeText(FirstActivity.this, "firstactivity", Toast.LENGTH_SHORT).show();
    }

}
