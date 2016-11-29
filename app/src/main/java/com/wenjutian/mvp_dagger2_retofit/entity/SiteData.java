package com.wenjutian.mvp_dagger2_retofit.entity;

import java.util.List;

/**
 * Created by Tao.ZT.Zhang on 2016/9/22.
 */
public class SiteData {
    private List<SiteItem> SiteData;

    @Override
    public String toString() {
        return "SiteData{" +
                "SiteData=" + SiteData +
                '}';
    }

    public List<SiteItem> getSiteData() {
        return SiteData;
    }

    public void setSiteData(List<SiteItem> SiteData) {
        this.SiteData = SiteData;
    }

}
