package com.wenjutian.mvp_dagger2_retofit.entity;

import java.util.List;

/**
 * Created by V.Wenju.Tian on 2016/8/30.
 */
public class HotTopicBean {

    /**
     * status : true
     * sessionTimeout : false
     * title : Get Hot Topics Completed!
     * msg : Complete
     * type : null
     * jsonData : {"HotTopics":[{"TopicName":"物聯網"},{"TopicName":"工業4.0"},{"TopicName":"Machine Learning"},{"TopicName":"Big Data"},{"TopicName":"穿戴式裝置"}]}
     */

    private boolean status;
    private boolean sessionTimeout;
    private String title;
    private String msg;
    private Object type;
    private JsonDataBean jsonData;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public JsonDataBean getJsonData() {
        return jsonData;
    }

    public void setJsonData(JsonDataBean jsonData) {
        this.jsonData = jsonData;
    }

    public static class JsonDataBean {
        /**
         * TopicName : 物聯網
         */

        private List<HotTopicsBean> HotTopics;

        public List<HotTopicsBean> getHotTopics() {
            return HotTopics;
        }

        public void setHotTopics(List<HotTopicsBean> HotTopics) {
            this.HotTopics = HotTopics;
        }

        public static class HotTopicsBean {
            private String TopicName;

            public String getTopicName() {
                return TopicName;
            }

            public void setTopicName(String TopicName) {
                this.TopicName = TopicName;
            }
        }
    }
}
