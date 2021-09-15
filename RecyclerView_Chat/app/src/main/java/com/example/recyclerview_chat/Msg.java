package com.example.recyclerview_chat;

/**
 * 实体类
 */
public class Msg {
    //收到的消息
    public static final int TYPE_RECEIVED = 0;
    //发送消息
    public static final int TYPE_SENT = 1;

    private String content;
    private int type;

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
