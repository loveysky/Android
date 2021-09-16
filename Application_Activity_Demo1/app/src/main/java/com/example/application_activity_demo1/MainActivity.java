package com.example.application_activity_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //显示跳转
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                //传递数据
                intent.putExtra("name","fan");
                intent.putExtra("reword", 8);
                startActivity(intent);
            }
        });


        Log.d("fanA", "--onCreate--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fanA", "--onStart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fanA", "--onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fanA", "--onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fanA", "--onStop--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fanA", "--onRestart--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fanA", "--onDestroy--");
    }
}