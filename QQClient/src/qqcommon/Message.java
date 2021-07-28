package qqcommon;

/**
 * @author 朱香原
 * 表示客户端和服务端通信时的信息对象
 */
public class Message {
    private static final long serialVersionUID = 1L;  //增加兼容性
    private String sender; //发送者
    private String getter; //接受者
    private String content;  //消息内容
    private String sendTime; //发送时间
    private String mesType; //消息类型，可以在接口定义消息类型

    public Message(String sender, String getter, String content, String sendTime) {
        this.sender = sender;
        this.getter = getter;
        this.content = content;
        this.sendTime = sendTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }
}
