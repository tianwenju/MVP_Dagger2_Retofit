package com.wenjutian.mvp_dagger2_retofit.entity;

/**
 * Created by V.Wenju.Tian on 2016/8/31.
 */
public class UpDataMessage {

    /**
     * title : Update User Interested Topics Completed!
     * type : null
     * msg : Complete
     * status : true
     * sessionTimeout : false
     * jsonData : null
     */

    private String title;
    private Object type;
    private String msg;
    private boolean status;
    private boolean sessionTimeout;
    private Object jsonData;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(boolean sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Object getJsonData() {
        return jsonData;
    }

    public void setJsonData(Object jsonData) {
        this.jsonData = jsonData;
    }
}
