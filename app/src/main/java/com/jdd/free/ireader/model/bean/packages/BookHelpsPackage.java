package com.jdd.free.ireader.model.bean.packages;

import com.jdd.free.ireader.model.bean.BaseBean;
import com.jdd.free.ireader.model.bean.BookHelpsBean;

import java.util.List;

/**
 * Created by jdd on 17-4-20.
 */

public class BookHelpsPackage extends BaseBean {

    private List<BookHelpsBean> helps;

    public List<BookHelpsBean> getHelps() {
        return helps;
    }

    public void setHelps(List<BookHelpsBean> helps) {
        this.helps = helps;
    }

}
