package com.jdd.free.ireader.presenter.contract;

import com.jdd.free.ireader.model.bean.BookCommentBean;
import com.jdd.free.ireader.model.flag.BookDistillate;
import com.jdd.free.ireader.model.flag.BookSort;
import com.jdd.free.ireader.model.flag.CommunityType;
import com.jdd.free.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by jdd on 17-4-20.
 */

public interface DiscCommentContact {

    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BookCommentBean> beans);
        void finishLoading(List<BookCommentBean> beans);
        void showErrorTip();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void firstLoading(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void refreshComment(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void loadingComment(CommunityType block, BookSort sort, int start, int limited, BookDistillate distillate);
        void saveComment(List<BookCommentBean> beans);
    }
}
