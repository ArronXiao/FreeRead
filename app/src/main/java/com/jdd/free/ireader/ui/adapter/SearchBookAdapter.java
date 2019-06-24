package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.model.bean.packages.SearchBookPackage;
import com.jdd.free.ireader.ui.adapter.view.SearchBookHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-6-2.
 */

public class SearchBookAdapter extends BaseListAdapter<SearchBookPackage.BooksBean>{
    @Override
    protected IViewHolder<SearchBookPackage.BooksBean> createViewHolder(int viewType) {
        return new SearchBookHolder();
    }
}
