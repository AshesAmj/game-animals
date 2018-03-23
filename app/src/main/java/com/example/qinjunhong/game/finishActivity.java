package com.example.qinjunhong.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class finishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }
    public void btnplay(View view) {
        Intent intent = new Intent(finishActivity.this, gameActivity.class);
        startActivity(intent);
        finishActivity.this.finish();
    }
    public void btnexit(View view) {
        System.exit(0);
    }
}
