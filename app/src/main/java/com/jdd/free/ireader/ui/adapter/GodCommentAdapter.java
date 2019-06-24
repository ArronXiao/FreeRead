package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.CommentBean;
import com.jdd.free.ireader.ui.adapter.view.CommentHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-4-29.
 */

public class GodCommentAdapter extends BaseListAdapter<CommentBean>{
    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(true);
    }
}
