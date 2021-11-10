package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tool.calculate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * 初始化
     */

    //表达式
    private StringBuilder stringBuilderFinish = new StringBuilder();

    //获取撤销图片按钮
    private ImageView imageView00;


    //获取过程和结果显示框
    private TextView processTextview;
    private TextView resultTextview;

    //获取全部按钮
    private TextView textView00;
    private TextView textView01;
    private TextView textView02;
    private TextView textView03;
    private TextView textView04;
    private TextView textView05;
    private TextView textView06;
    private TextView textView07;
    private TextView textView08;
    private TextView textView09;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;
    private TextView textView25;
    private TextView textView26;




    //当前正在输入的东西
    private StringBuilder currentInputNum = new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取所有按钮
        textView00 = findViewById(R.id.textView00);
        textView01 = findViewById(R.id.textView01);
        textView02 = findViewById(R.id.textView02);
        textView03 = findViewById(R.id.textView03);
        textView04 = findViewById(R.id.textView04);
        textView05 = findViewById(R.id.textView05);
        textView06 = findViewById(R.id.textView06);
        textView07 = findViewById(R.id.textView07);
        textView08 = findViewById(R.id.textView08);
        textView09 = findViewById(R.id.textView09);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);


        //获取过程和结果显示框
        processTextview = findViewById(R.id.process_textview);
        resultTextview = findViewById(R.id.result_textview);
        //获取撤销图片按钮
        imageView00 = findViewById(R.id.imageView00);





        //清空按钮
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearButtonClicked(view);
            }
        });


        //返回按钮
        imageView00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backButtonClicked(view);
            }
        });
        //运算符键
        //加
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });
        //减
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });
        //乘
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });
        //除
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });
        //sin
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = calculate.sinCalculate(Double.parseDouble(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });
        //cos
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = calculate.cosCalculate(Double.parseDouble(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });
        //tan
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = calculate.tanCalculate(Double.parseDouble(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });

        //x!
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = processTextview.getText().toString();
                if(string1.contains(".")){
                    resultTextview.setText("error");
                    return;
                }

                int result = calculate.jieCheng(Integer.parseInt(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });
        //x²
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = calculate.sqlCalculate(Double.parseDouble(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });
        //x³
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = calculate.liFangCalculate(Double.parseDouble(processTextview.getText().toString()));

                //显示结果
                resultTextview.setText(result+"");
            }
        });
        //进制转化
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        //单位换算
        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        //左括号
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });
        //右括号
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorButtonClicked(view);
            }
        });

        //0-9
        textView00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });
        textView09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });

        //等号
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equalButtonClicked(view);
            }
        });

        //小数点
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberButtonClicked(view);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }

    /**
     * 添加点击事件
     */

    //数字键
    public void numberButtonClicked(View view){
        //将view转为TextView
        TextView textViewNumber = (TextView) view;

        stringBuilderFinish.append(textViewNumber.getText().toString());


        //显示内容
        showUI();

    }
    //运算符键
    public void operatorButtonClicked(View view){
        //将view转为TextView
        TextView tv = (TextView) view;

        stringBuilderFinish.append(tv.getText().toString());

        //显示内容
        showUI();

    }
    //清空键
    public void clearButtonClicked(View view){
        processTextview.setText("");


        TextView resultTextview = (TextView)findViewById(R.id.result_textview);
        resultTextview.setText("0");

        stringBuilderFinish = new StringBuilder();


    }
    //撤销键
    public void backButtonClicked(View view){


        stringBuilderFinish.deleteCharAt(stringBuilderFinish.length()-1);
        showUI();
        //计算结果
//        judgeCalculate();

    }
    //等于号
    public void equalButtonClicked(View view){
        //计算结果
        calculate1();
    }

    //拼接当前运算的表达式，显示到屏幕上
    private void showUI(){

        processTextview.setText(stringBuilderFinish.toString());

    }

    //新版计算
    private void calculate1(){
        stringBuilderFinish.append("=");

        Log.v("mmmm",stringBuilderFinish.toString());
        double result = com.tool.calculate.calculator(stringBuilderFinish.toString());

        //显示结果
        resultTextview.setText(result+"");
    }


}