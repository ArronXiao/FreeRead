package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.packages.BillboardPackage;
import com.jdd.free.ireader.ui.base.BaseContract;

/**
 * Created by jdd on 17-4-23.
 */

public interface BillboardContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BillboardPackage beans);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void loadBillboardList();
    }
}
