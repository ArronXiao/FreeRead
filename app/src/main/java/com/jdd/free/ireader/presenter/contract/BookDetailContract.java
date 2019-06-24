package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.BookDetailBean;
import com.jdd.free.ireader.model.bean.BookListBean;
import com.jdd.free.ireader.model.bean.CollBookBean;
import com.jdd.free.ireader.model.bean.HotCommentBean;
import com.jdd.free.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by jdd on 17-5-4.
 */

public interface BookDetailContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(BookDetailBean bean);
        void finishHotComment(List<HotCommentBean> beans);
        void finishRecommendBookList(List<BookListBean> beans);

        void waitToBookShelf();
        void errorToBookShelf();
        void succeedToBookShelf();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookDetail(String bookId);
        //添加到书架上
        void addToBookShelf(CollBookBean collBook);
    }
}
