package com.jdd.free.ireader.ui.adapter.view;

import android.widget.ImageView;
import android.widget.TextView;

import com.jdd.free.ireader.R;
import com.jdd.free.ireader.model.bean.SectionBean;
import com.jdd.free.ireader.ui.base.adapter.ViewHolderImpl;

/**
 * Created by jdd on 17-4-16.
 */

public class SectionHolder extends ViewHolderImpl<SectionBean>{

    private ImageView mIvIcon;
    private TextView mTvName;

    @Override
    public void initView(){
        mIvIcon =findById(R.id.section_iv_icon);
        mTvName =findById(R.id.section_tv_name);
    }

    @Override
    public void onBind(SectionBean value, int pos) {
        mIvIcon.setImageResource(value.getDrawableId());
        mTvName.setText(value.getName());
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_section;
    }
}
