package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.SectionBean;
import com.jdd.free.ireader.ui.adapter.view.SectionHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-4-16.
 */

public class SectionAdapter extends BaseListAdapter<SectionBean> {
    @Override
    protected IViewHolder<SectionBean> createViewHolder(int viewType) {
        return new SectionHolder();
    }
}
