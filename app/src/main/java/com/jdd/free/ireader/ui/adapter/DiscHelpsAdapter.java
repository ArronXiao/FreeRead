package com.jdd.free.ireader.ui.adapter;

import android.content.Context;

import com.jdd.free.ireader.model.bean.BookHelpsBean;
import com.jdd.free.ireader.ui.adapter.view.DiscHelpsHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.widget.adapter.WholeAdapter;

/**
 * Created by jdd on 17-4-21.
 */

public class DiscHelpsAdapter extends WholeAdapter<BookHelpsBean>{

    public DiscHelpsAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookHelpsBean> createViewHolder(int viewType) {
        return new DiscHelpsHolder();
    }
}
