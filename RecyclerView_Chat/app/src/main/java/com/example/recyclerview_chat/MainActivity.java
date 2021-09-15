package com.example.recyclerview_chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecyclerView;
    private MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMsgs(); // 初始化消息数据

        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgRecyclerView = (RecyclerView) findViewById(R.id.msg_recView);
        //设置好布局方式。这里选线性布局
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        //引用数据
        adapter = new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(adapter);

        //给button设置点击事件
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取输入框内容，并且遍历
                String content = inputText.getText().toString();
                //字符串长度不为空
                if (! "".equals(content)) {
                    //第一个参数 携带的字符串，第二个 发送消息
                    Msg msg = new Msg(content, Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size() -1); // 当有新消息时，刷新RecyclerView中的显示
                    msgRecyclerView.scrollToPosition(msgList.size() -1); // 将RecyclerView定位到最后一行
                    inputText.setText(""); // 清空输入框中的内容
                }
            }
        });

    }

    /**
     * initMsgs() 初始化三条数据
     */
    private void initMsgs() {
        Msg msg1 = new Msg("你好fan，初次来到这里，让我带你随便转转", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("我刚来有什么顺手的武器吗？", Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("来了解一下你能使用的武器", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}