package com.jdd.free.ireader.model.bean.packages;

import com.jdd.free.ireader.model.bean.BaseBean;
import com.jdd.free.ireader.model.bean.HotCommentBean;

import java.util.List;

/**
 * Created by jdd on 17-5-4.
 */

public class HotCommentPackage extends BaseBean {

    private List<HotCommentBean> reviews;

    public List<HotCommentBean> getReviews() {
        return reviews;
    }

    public void setReviews(List<HotCommentBean> reviews) {
        this.reviews = reviews;
    }
}
