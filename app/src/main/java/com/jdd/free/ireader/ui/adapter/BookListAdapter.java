package com.jdd.free.ireader.ui.adapter;

import android.content.Context;

import com.jdd.free.ireader.model.bean.BookListBean;
import com.jdd.free.ireader.ui.adapter.view.BookListHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.widget.adapter.WholeAdapter;

/**
 * Created by jdd on 17-5-1.
 */

public class BookListAdapter extends WholeAdapter<BookListBean> {
    public BookListAdapter() {
    }

    public BookListAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookListBean> createViewHolder(int viewType) {
        return new BookListHolder();
    }
}
