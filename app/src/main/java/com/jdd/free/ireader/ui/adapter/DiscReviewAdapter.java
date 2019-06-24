package com.jdd.free.ireader.ui.adapter;

import android.content.Context;

import com.jdd.free.ireader.model.bean.BookReviewBean;
import com.jdd.free.ireader.ui.adapter.view.DiscReviewHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.widget.adapter.WholeAdapter;

/**
 * Created by jdd on 17-4-21.
 */

public class DiscReviewAdapter extends WholeAdapter<BookReviewBean> {

    public DiscReviewAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<BookReviewBean> createViewHolder(int viewType) {
        return new DiscReviewHolder();
    }
}
