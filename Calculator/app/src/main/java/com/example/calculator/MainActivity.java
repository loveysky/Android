package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //当前正在输入的东西
    private StringBuilder currentInputNum = new StringBuilder();
    //存放数字的数组
    private List numList = new ArrayList<Integer>();
    //存放运算符的数组
    private List operatorList = new ArrayList<String>();
    //判断输入完成了吗
    private boolean isNumStart = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * 添加点击事件
     */
    //数字键
    public void numberButtonClicked(View view){
        //将view转为TextView
        TextView textViewNumber = (TextView) view;

        if(isNumStart){
            //当前输入的是一个新的数字，添加到数组中
            numList.add(Integer.parseInt(textViewNumber.getText().toString()));
            //更改状态
            isNumStart = false;
        }else{
            numList.set(numList.size()-1,Integer.parseInt(textViewNumber.getText().toString()));
        }

        //拿到数字，拼接到currentInputNum，显示到文本（process_textview）中
        currentInputNum.append(textViewNumber.getText().toString());
        if(currentInputNum.toString().equals("0")){
            //清空
            currentInputNum.delete(0,currentInputNum.length());
        }
        //获取上方的过程框
        TextView textView1 = (TextView) findViewById(R.id.process_textview);
        textView1.setText(currentInputNum.toString());




    }
    //运算符键
    public void operatorButtonClicked(View view){
        Log.v("myTag", "operator");
    }
    //清空键
    public void clearButtonClicked(View view){
        //获取上方的过程框
        TextView textView1 = (TextView) findViewById(R.id.process_textview);
        textView1.setText("");
        currentInputNum.delete(0,currentInputNum.length());
    }
    //撤销键
    public void backButtonClicked(View view){
        Log.v("myTag", "back");
    }
    //等于号
    public void equalButtonClicked(View view){
        Log.v("myTag", "equal");
    }
}