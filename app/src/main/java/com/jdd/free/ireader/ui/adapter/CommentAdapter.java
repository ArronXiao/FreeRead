package com.jdd.free.ireader.ui.adapter;

import android.content.Context;

import com.jdd.free.ireader.model.bean.CommentBean;
import com.jdd.free.ireader.ui.adapter.view.CommentHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.widget.adapter.WholeAdapter;

/**
 * Created by jdd on 17-4-29.
 */

public class CommentAdapter extends WholeAdapter<CommentBean> {

    public CommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(false);
    }
}
