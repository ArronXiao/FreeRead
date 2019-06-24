package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.BookSortBean;
import com.jdd.free.ireader.ui.adapter.view.BookSortHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-4-23.
 */

public class BookSortAdapter extends BaseListAdapter<BookSortBean>{

    @Override
    protected IViewHolder<BookSortBean> createViewHolder(int viewType) {
        return new BookSortHolder();
    }
}
