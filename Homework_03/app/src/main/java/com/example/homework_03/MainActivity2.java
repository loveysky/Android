package com.example.homework_03;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.tv_1);
        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name1");
        int reword1 = bundle.getInt("reword1");
//        String name2 = bundle.getString("name2");
//        int reword2 = bundle.getInt("reword2");

        textView.setText(name1 + "," + reword1 + "\n");



        Log.d("fanB", "--onCreate--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fanB", "--onStart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fanB", "--onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fanB", "--onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fanB", "--onStop--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fanB", "--onRestart--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fanB", "--onDestroy--");
    }
}