package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class EditTextActivity extends AppCompatActivity {
    //声明控件
    private Button btnLogin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        //获取控件
        btnLogin = (Button) findViewById(R.id.btn_login);

        EditText etUsername = (EditText)findViewById(R.id.et_1);
        EditText etPassword = (EditText) findViewById(R.id.et_2);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //获取用户名和密码中输入内容
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                boolean flag = checkLogin(username, password);

                if(flag){
                    Toast.makeText(EditTextActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(EditTextActivity.this, "登录失败，用户名或密码错误！", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    //验证账号密码
    private boolean checkLogin(String username, String password){
        boolean flag = false;
        if("abc".equals(username) && "123".equals(password)){
            flag = true;
        }
        return flag;
    }
}