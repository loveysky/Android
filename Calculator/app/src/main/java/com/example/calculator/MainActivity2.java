package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.tool.calculate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    //初始化6个下拉菜单框
    private Spinner spinner01, spinner02, spinner03, spinner04, spinner05, spinner06;

    //初始化三个输入框
    private EditText editText01, editText02, editText03;

    //初始化三个结果框
    private TextView resultView50, resultView51, resultView52;

    //用来存储两个下拉菜单和输入数字的表
    private List<String> list = new ArrayList();

    //初始化AC键和=键
    private TextView textView80, textView81;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /**
         * 获取全部的按钮
         */
        //获取6个下拉菜单框
        spinner01 = findViewById(R.id.spinner01);
        spinner02 = findViewById(R.id.spinner02);
        spinner03 = findViewById(R.id.spinner03);
        spinner04 = findViewById(R.id.spinner04);
        spinner05 = findViewById(R.id.spinner05);
        spinner06 = findViewById(R.id.spinner06);

        //获取三个结果框
        resultView50 = findViewById(R.id.resultView50);
        resultView51 = findViewById(R.id.resultView51);
        resultView52 = findViewById(R.id.resultView52);

        //获取三个输入框
        editText01 = findViewById(R.id.editText01);
        editText02 = findViewById(R.id.editText02);
        editText03 = findViewById(R.id.editText03);

        //获取AC键和=键
        textView80 = findViewById(R.id.textView80);
        textView81 = findViewById(R.id.textView81);

        /**
         * 进制转换选框以及其监听事件
         */

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.jinZhi, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner01.setAdapter(adapter1);
        spinner02.setAdapter(adapter1);

        //spinner01监听事件
        spinner01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //接收第一个下拉菜单的选项
                String s = adapter1.getItem(i).toString();
                list.add(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //spinner02监听事件
        spinner02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //接收第二个下拉菜单的选项
                String s = adapter1.getItem(i).toString();
                list.add(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        /**
         * 长度转换选框以及其监听事件
         */

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner03.setAdapter(adapter2);
        spinner04.setAdapter(adapter2);

        //spinner03监听事件
        spinner03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //spinner04监听事件
        spinner04.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        /**
         * 汇率转换选框以及其监听事件
         */

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.money, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner05.setAdapter(adapter3);
        spinner06.setAdapter(adapter3);

        //spinner05监听事件
        spinner05.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //spinner06监听事件
        spinner06.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //当某个item被选中
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //=号键
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equalButtonClick(view);
            }
        });

        //AC键
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearButtonClick(view);
            }
        });



    }

    /**
     * = 键
     */
    public void equalButtonClick(View view){
        //将view转为TextView
        TextView textViewNumber = (TextView) view;

        //获取输入框内容
        String s1 = editText01.getText().toString();


        //将输入的数字放入list
        list.add(s1);

        //调用转换方法，将结果输出在屏幕上
        if(list.size() > 0){
            String result = calculate.numberSwitch(list);
            resultView50.setText(result);
        }else{
            resultView50.setText("输入错误");
        }
    }

    /**
     * 清空
     */
    public void clearButtonClick(View view){
        editText01.setText("");
        editText02.setText("");
        editText03.setText("");

        resultView50.setText("0");
        resultView51.setText("0");
        resultView52.setText("0");

        list.clear();

    }
}