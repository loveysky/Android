package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * 初始化
     */
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
    //存放数字的数组
    private List numList = new ArrayList<Double>();
    //存放运算符的数组
    private List operatorList = new ArrayList<String>();
    //判断输入完成了吗
    private boolean isNumStart = true;




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
        //cos
        //tan
        //x!
        //x²
        //x³
        //进制转化
        //单位换算

        //左括号
        //右括号

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



        //拿到数字，拼接到currentInputNum，显示到文本（process_textview）中
        currentInputNum.append(textViewNumber.getText().toString());

        if(isNumStart){
            //当前输入的是一个新的数字，添加到数组中
            numList.add(Double.parseDouble(textViewNumber.getText().toString()));
            //更改状态
            isNumStart = false;
        }else{
            numList.set(numList.size()-1,Double.parseDouble(currentInputNum.toString()));
        }

        //显示内容
        showUI();
        //计算结果
//        judgeCalculate();
    }
    //运算符键
    public void operatorButtonClicked(View view){
        //将view转为TextView
        TextView tv = (TextView) view;
        //保存当前运算符
        operatorList.add(tv.getText().toString());
        //改变状态(输完运算符后，下一个数字就是一个数字的开始)
        isNumStart = true;
        currentInputNum.delete(0, currentInputNum.length());

        //显示内容
        showUI();

    }
    //清空键
    public void clearButtonClicked(View view){
        TextView processTextview = (TextView)findViewById(R.id.process_textview);
        processTextview.setText("");
        currentInputNum.delete(0,currentInputNum.length());
        numList.clear();
        operatorList.clear();

        TextView resultTextview = (TextView)findViewById(R.id.result_textview);
        resultTextview.setText("0");

        isNumStart = true;
    }
    //撤销键
    public void backButtonClicked(View view){
        //判断应该撤销运算符还是数字
        if(numList.size() > operatorList.size()){
            //撤销数字
            if(numList.size() > 0){
                numList.remove(numList.size()-1);
                isNumStart = true;
                currentInputNum.delete(0, currentInputNum.length());
            }


        }else {
            //撤销运算符
            if(operatorList.size() > 0){
                operatorList.remove(operatorList.size()-1);
                isNumStart = false;
                //当前输入的追加最后输入的那个数字
                if(numList.size() > 0){
                    currentInputNum.append(numList.get(numList.size()-1));
                }
            }

        }
        showUI();
        //计算结果
//        judgeCalculate();

    }
    //等于号
    public void equalButtonClicked(View view){
        //计算结果
        //judgeCalculate();
        calculate1();
    }

    //拼接当前运算的表达式，显示到屏幕上
    private void showUI(){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < numList.size(); i++){
            str.append(numList.get(i));
            //判断运算符数组中对应位置是否有内容
            if(operatorList.size() > i){
                //将i对应的操作符拼接到str
                str.append(" " + operatorList.get(i) + " ");
            }
        }
        TextView processTextview = (TextView)findViewById(R.id.process_textview);
        processTextview.setText(str.toString());
    }

    //实现逻辑运算
    private void judgeCalculate(){
        if(numList.size() > 0){
            //记录第一个运算数
            double param1 = (double) numList.get(0);
            //记录第二个运算数
            double param2 = 0;
            int i = 0;
            if(operatorList.size() > 0){
                for(; i < operatorList.size(); i++){
                    //取出运算符
                    String operate = operatorList.get(i).toString();
                    //判断是不是乘除
                    if(operate.equals("*") || operate.equals("/")){
                        if(i + 1 < numList.size()){
                            param2 = (double) numList.get(i+1);
                            //运算
                            param1 = calculate(param1, param2, operate);
                        }
                    }else {
                        //如果是加减,得判断下一个运算符是不是乘除
                        //判断是不是最后一个，或者 后面不是乘除
                        if(i == operatorList.size()-1 ||
                                !operatorList.get(i+1).equals("*") && !operatorList.get(i+1).equals("/")){
                            //直接运算
                            if(i < numList.size() - 1){
                                param2 = (double) numList.get(i+1);
                                param1 = calculate(param1, param2, operate);
                            }

                        }else{
                            //后面还有运算符而且是乘或者是除
                            int j = i+1;
                            double op1 = (double) numList.get(j);
                            double op2 = 0;
                            while(true){
                                //是乘或者除
                                if(operatorList.get(j).equals("*") ||operatorList.get(j).equals("/")){
                                    if(j < operatorList.size() - 1){
                                        op2 = (double) numList.get(j+1);
                                        op1 = calculate(op1, op2, operatorList.get(j).toString());
                                    }

                                }else {
                                    //乘除做完了，剩加减了
                                    break;
                                }
                                j++;
                                if(j == operatorList.size()){
                                    break;
                                }
                            }
                            param2 = op1;
                            param1 = calculate(param1, param2, operate);
                            i = j - 1;
                        }

                    }
                }

            }
            //遍历完成，显示结果
            TextView resultTextview = (TextView)findViewById(R.id.result_textview);
            resultTextview.setText(String.format("%.2f", param1));

        }else {
            TextView textView1 = (TextView) findViewById(R.id.result_textview);
            textView1.setText("0");
        }
    }

    //计算
    private double calculate(double param1, double param2, String operate){
        double result = 0;
        switch(operate){
            case"+": result = param1 + param2; break;
            case"-": result = param1 - param2; break;
            case"*": result = param1 * param2; break;
            case"/": result = param1 / param2; break;
        }
        return result;
    }

    //新版计算
    private void calculate1(){
        processTextview = (TextView) findViewById(R.id.process_textview);
        String finishStr = processTextview.getText().toString();


        System.out.println(finishStr.toString());
        double result = com.tool.calculate.calculator(finishStr.toString());

        //显示结果
        resultTextview = (TextView)findViewById(R.id.result_textview);
        resultTextview.setText(String.format("%.2f", result));
    }


}