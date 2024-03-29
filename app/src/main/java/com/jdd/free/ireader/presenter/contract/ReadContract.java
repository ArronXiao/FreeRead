package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.BookChapterBean;
import com.jdd.free.ireader.ui.base.BaseContract;
import com.jdd.free.ireader.widget.page.TxtChapter;

import java.util.List;

/**
 * Created by jdd on 17-5-16.
 */

public interface ReadContract extends BaseContract{
    interface View extends BaseContract.BaseView {
        void showCategory(List<BookChapterBean> bookChapterList);
        void finishChapter();
        void errorChapter();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void loadCategory(String bookId);
        void loadChapter(String bookId,List<TxtChapter> bookChapterList);
    }
}
