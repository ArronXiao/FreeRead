package com.jdd.free.ireader.ui.adapter;

import android.support.v7.widget.RecyclerView;

import com.jdd.free.ireader.model.bean.BookTagBean;
import com.jdd.free.ireader.ui.adapter.view.TagChildHolder;
import com.jdd.free.ireader.ui.adapter.view.TagGroupHolder;
import com.jdd.free.ireader.ui.base.adapter.IViewHolder;
import com.jdd.free.ireader.ui.base.adapter.GroupAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdd on 17-5-5.
 * BookListTagGroup
 */

public class TagGroupAdapter extends GroupAdapter<String,String> {
    private static final String TAG = "TagGroupAdapter";
    private List<BookTagBean> mBookTagList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    public TagGroupAdapter(RecyclerView recyclerView, int spanSize) {
        super(recyclerView, spanSize);
        mRecyclerView = recyclerView;
    }

    @Override
    public int getGroupCount() {
        return mBookTagList.size();
    }

    @Override
    public int getChildCount(int groupPos) {
        List<String> tagList = mBookTagList.get(groupPos).getTags();
        return tagList.size();
    }

    @Override
    public String getGroupItem(int groupPos) {
        return mBookTagList.get(groupPos).getName();
    }

    @Override
    public String getChildItem(int groupPos, int childPos) {
        List<String> tagList = getChildItems(groupPos);
        return tagList.get(childPos);
    }

    @Override
    protected IViewHolder<String> createGroupViewHolder() {
        //是个TextView
        return new TagGroupHolder();
    }

    @Override
    protected IViewHolder<String> createChildViewHolder() {
        //是个TextView
        return new TagChildHolder();
    }

    public List<String> getChildItems(int groupPos){
        return mBookTagList.get(groupPos).getTags();
    }

    public void refreshItems(List<BookTagBean> bookTags){
        mBookTagList.clear();
        mBookTagList.addAll(bookTags);
        notifyDataSetChanged();
    }

}
