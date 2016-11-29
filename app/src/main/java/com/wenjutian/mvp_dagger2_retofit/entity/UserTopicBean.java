package com.wenjutian.mvp_dagger2_retofit.entity;

import java.util.List;

/**
 * Created by V.Wenju.Tian on 2016/8/30.
 */
public class UserTopicBean {

    /**
     * status : true
     * sessionTimeout : false
     * title : Get User Interested Topics Completed!
     * msg : Complete
     * type : null
     * jsonData : {"InterestedTopics":[{"TopicName":"物聯網","IsChecked":true},{"TopicName":"Machine Learning","IsChecked":false},{"TopicName":"Big Data","IsChecked":true}]}
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
         * IsChecked : true
         */

        private List<InterestedTopicsBean> InterestedTopics;

        public List<InterestedTopicsBean> getInterestedTopics() {
            return InterestedTopics;
        }

        public void setInterestedTopics(List<InterestedTopicsBean> InterestedTopics) {
            this.InterestedTopics = InterestedTopics;
        }

        public static class InterestedTopicsBean {
            private String TopicName;
            private boolean IsChecked;

            public String getTopicName() {
                return TopicName;
            }

            public void setTopicName(String TopicName) {
                this.TopicName = TopicName;
            }

            public boolean isIsChecked() {
                return IsChecked;
            }

            public void setIsChecked(boolean IsChecked) {
                this.IsChecked = IsChecked;
            }
        }
    }
}
