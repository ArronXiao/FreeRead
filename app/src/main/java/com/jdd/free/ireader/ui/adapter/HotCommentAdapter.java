package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.HotCommentBean;
import com.jdd.free.ireader.ui.adapter.view.HotCommentHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-5-4.
 */

public class HotCommentAdapter extends BaseListAdapter<HotCommentBean>{
    @Override
    protected IViewHolder<HotCommentBean> createViewHolder(int viewType) {
        return new HotCommentHolder();
    }
}
