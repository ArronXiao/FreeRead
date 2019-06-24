package com.jdd.free.ireader.ui.activity;

import android.app.Activity;
import android.support.v7.widget.Toolbar;

import com.jdd.free.ireader.R;
import com.jdd.free.ireader.ui.base.BaseActivity;

/**
 * Created by jdd on 17-5-26.
 */

public class CommunityActivity extends BaseActivity{

    @Override
    protected int getContentId() {
        return R.layout.activity_community;
    }

    @Override
    protected void setUpToolbar(Toolbar toolbar) {
        super.setUpToolbar(toolbar);
        getSupportActionBar().setTitle("社区");
    }
}
