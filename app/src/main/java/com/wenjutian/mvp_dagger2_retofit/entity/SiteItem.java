package com.wenjutian.mvp_dagger2_retofit.entity;

import java.io.Serializable;

/**
 * Created by Tao.ZT.Zhang on 2016/9/22.
 */
public class SiteItem implements Serializable, Comparable<SiteItem> {
    @Override
    public String toString() {
        return "SiteItem{" +
                "mIsStarred=" + mIsStarred +
                ", severity='" + severity + '\'' +
                ", alarmNum=" + alarmNum +
                ", SiteID='" + SiteID + '\'' +
                ", SiteName='" + SiteName + '\'' +
                ", Critical=" + Critical +
                ", Major=" + Major +
                ", Minor=" + Minor +
                ", Flag=" + Flag +
                ", ProductID='" + ProductID + '\'' +
                ", CircleID='" + CircleID + '\'' +
                ", ClusterID='" + ClusterID + '\'' +
                '}';
    }

    /**
     * SiteID : 00S1ACCM02
     * SiteName :  Robinson Road
     * Critical : 0
     * Major : 1
     * Minor : 1
     * Flag : false
     * ProductID : 12
     * CircleID : 17
     * ClusterID : 40
     */


        private static final long serialVersionUID = 1L;

        private boolean mIsStarred;

        private String severity;
        private int alarmNum;
        private String SiteID;
        private String SiteName;
        private int Critical;
        private int Major;
        private int Minor;
        private boolean Flag;
        private String ProductID;
        private String CircleID;
        private String ClusterID;

        public boolean ismIsStarred() {
            return mIsStarred;
        }


        public void setmIsStarred(boolean mIsStarred) {
            this.mIsStarred = mIsStarred;
        }

        public String getSiteName() {
            return SiteName;
        }

        public void setSiteName(String SiteName) {
            this.SiteName = SiteName;
        }

        public String getSiteID() {
            return SiteID;
        }

        public void setSiteID(String SiteID) {
            this.SiteID = SiteID;
        }

        public String getSeverity() {
            if (getCritical() > 0) {
                severity = "Critical";
            } else if (getMajor() > 0) {
                severity = "Major";
            } else if (getMinor() > 0) {
                severity = "Minor";
            } else {
                severity = "None";
            }
            return severity;
        }



        public void setSeverity(String severity) {
            this.severity = severity;
        }

        public int getCritical() {
            return Critical;
        }

        public void setCritical(int critical) {
            Critical = critical;
        }

        public int getMajor() {
            return Major;
        }

        public void setMajor(int major) {
            Major = major;
        }

        public int getMinor() {
            return Minor;
        }

        public void setMinor(int minor) {
            Minor = minor;
        }

        public boolean isFlag() {
            return Flag;
        }

        public void setFlag(boolean flag) {
            Flag = flag;
        }

        public String getProductID() {
            return ProductID;
        }

        public void setProductID(String productID) {
            ProductID = productID;
        }

        public String getCircleID() {
            return CircleID;
        }

        public void setCircleID(String circleID) {
            CircleID = circleID;
        }

        public String getClusterID() {
            return ClusterID;
        }

        public void setClusterID(String clusterID) {
            ClusterID = clusterID;
        }

        public SiteItem() {
            // TODO Auto-generated constructor stub
        }

        public SiteItem(String SiteID, String SiteName, int alarmNum,
                        String severity, boolean flag, String serivity) {
            super();
            this.SiteID = SiteID;
            this.severity = severity;
            this.alarmNum = alarmNum;
            this.SiteName = SiteName;
            this.Flag = flag;
            this.severity = serivity;
        }

        public SiteItem(String SiteID, String SiteName, int critical, int major,
                        int minor, Boolean flag, String productId, String circleID,
                        String clusterID) {
            this.SiteID = SiteID;
            this.SiteName = SiteName;
            this.Critical = critical;
            this.Major = major;
            this.Minor = minor;
            this.Flag = flag;
            this.ProductID = productId;
            this.CircleID = circleID;
            this.ClusterID = clusterID;
        }

        public SiteItem(String SiteID, String SiteName,int alarmNum, Boolean flag,String severity) {
            this.SiteID = SiteID;
            this.SiteName = SiteName;
            this.Flag = flag;
            this.alarmNum = alarmNum;
            this.severity = severity;
        }


        @Override
        public int compareTo(SiteItem another) {
            if (this.getAlarmNum() > another.getAlarmNum()) {
                return -1;
            } else if (this.getAlarmNum() == another.getAlarmNum()) {
                return 0;
            } else {
                return 1;
            }
        }

        public SiteItem(String SiteID) {
            super();
            this.SiteID = SiteID;
        }


        public int getAlarmNum() {
            return getCritical() + getMajor() + getMinor();
        }


        public void setAlarmNum(int alarmNum) {
            this.alarmNum = alarmNum;
        }


}
