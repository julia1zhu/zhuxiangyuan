package qqcommon;

import java.io.Serializable;

/**
 * @author 朱香原
 * 表示一个用户/客户信息
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;  //增加兼容性
    private String userId;  //用户ID/用户名
    private String pwd;   //用户密码

    public User(String userId, String pwd) {
        this.userId = userId;
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
