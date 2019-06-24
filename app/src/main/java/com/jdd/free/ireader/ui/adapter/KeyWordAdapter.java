package com.jdd.free.ireader.ui.adapter;

import com.jdd.free.ireader.ui.adapter.view.KeyWordHolder;
import com.jdd.free.ireader.ui.base.adapter.BaseListAdapter;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;

/**
 * Created by jdd on 17-6-2.
 */

public class KeyWordAdapter extends BaseListAdapter<String> {
    @Override
    protected IViewHolder<String> createViewHolder(int viewType) {
        return new KeyWordHolder();
    }
}
