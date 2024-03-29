package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.BookHelpsBean;
import com.jdd.free.ireader.model.flag.BookDistillate;
import com.jdd.free.ireader.model.flag.BookSort;
import com.jdd.free.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by jdd on 17-4-21.
 */

public interface DiscHelpsContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BookHelpsBean> beans);
        void finishLoading(List<BookHelpsBean> beans);
        void showErrorTip();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void firstLoading(BookSort sort, int start, int limited, BookDistillate distillate);
        void refreshBookHelps(BookSort sort, int start, int limited, BookDistillate distillate);
        void loadingBookHelps(BookSort sort, int start,int limited,BookDistillate distillate);
        void saveBookHelps(List<BookHelpsBean> beans);
    }
}
