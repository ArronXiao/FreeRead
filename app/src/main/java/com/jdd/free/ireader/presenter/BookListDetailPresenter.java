package com.jdd.free.ireader.presenter;

import com.jdd.free.ireader.model.remote.RemoteRepository;
import com.jdd.free.ireader.presenter.contract.BookListContract;
import com.jdd.free.ireader.presenter.contract.BookListDetailContract;
import com.jdd.free.ireader.ui.base.RxPresenter;
import com.jdd.free.ireader.utils.LogUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jdd on 17-5-2.
 */

public class BookListDetailPresenter extends RxPresenter<BookListDetailContract.View> implements BookListDetailContract.Presenter {
    @Override
    public void refreshBookListDetail(String detailId) {
        Disposable refreshDispo = RemoteRepository.getInstance()
                .getBookListDetail(detailId)
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
        addDisposable(refreshDispo);
    }
}
