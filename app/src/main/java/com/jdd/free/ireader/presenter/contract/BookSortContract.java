package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.packages.BookSortPackage;
import com.jdd.free.ireader.model.bean.packages.BookSubSortPackage;
import com.jdd.free.ireader.ui.base.BaseContract;

/**
 * Created by jdd on 17-4-23.
 */

public interface BookSortContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BookSortPackage sortPackage, BookSubSortPackage subSortPackage);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshSortBean();
    }
}
