package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.CollBookBean;
import com.jdd.free.ireader.ui.adapter.view.CollBookHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.widget.adapter.WholeAdapter;

/**
 * Created by jdd on 17-5-8.
 */

public class CollBookAdapter extends WholeAdapter<CollBookBean> {

    @Override
    protected IViewHolder<CollBookBean> createViewHolder(int viewType) {
        return new CollBookHolder();
    }

}
