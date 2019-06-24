package com.jdd.free.ireader.presenter;

import android.util.Log;

import com.jdd.free.ireader.model.remote.RemoteRepository;
import com.jdd.free.ireader.presenter.contract.BillBookContract;
import com.jdd.free.ireader.ui.base.RxPresenter;
import com.jdd.free.ireader.utils.LogUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jdd on 17-5-3.
 */

public class BillBookPresenter extends RxPresenter<BillBookContract.View>
        implements BillBookContract.Presenter {
    private static final String TAG = "BillBookPresenter";
    @Override
    public void refreshBookBrief(String billId) {
        Disposable remoteDisp = RemoteRepository.getInstance()
                .getBillBooks(billId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (beans)-> {
                            mView.finishRefresh(beans);
                            mView.complete();
                        }
                        ,
                        (e) ->{
                            mView.showError();
                            LogUtils.e(e);
                        }
                );
        addDisposable(remoteDisp);
    }
}
