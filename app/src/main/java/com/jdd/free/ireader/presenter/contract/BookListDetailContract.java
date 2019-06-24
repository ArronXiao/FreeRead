package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.BookListDetailBean;
import com.jdd.free.ireader.ui.base.BaseContract;

/**
 * Created by jdd on 17-5-1.
 */

public interface BookListDetailContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookListDetailBean bean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookListDetail(String detailId);
    }
}
