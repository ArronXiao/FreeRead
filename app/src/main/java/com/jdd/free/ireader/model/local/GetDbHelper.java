package com.jdd.free.ireader.model.local;

import com.jdd.free.ireader.model.bean.AuthorBean;
import com.jdd.free.ireader.model.bean.DownloadTaskBean;
import com.jdd.free.ireader.model.bean.packages.BillboardPackage;
import com.jdd.free.ireader.model.bean.ReviewBookBean;
import com.jdd.free.ireader.model.bean.BookCommentBean;
import com.jdd.free.ireader.model.bean.BookHelpfulBean;
import com.jdd.free.ireader.model.bean.BookHelpsBean;
import com.jdd.free.ireader.model.bean.BookReviewBean;
import com.jdd.free.ireader.model.bean.packages.BookSortPackage;

import java.util.List;

import io.reactivex.Single;

/**
 * Created by jdd on 17-4-28.
 */

public interface GetDbHelper {
    Single<List<BookCommentBean>> getBookComments(String block, String sort, int start, int limited, String distillate);
    Single<List<BookHelpsBean>> getBookHelps(String sort, int start, int limited, String distillate);
    Single<List<BookReviewBean>> getBookReviews(String sort, String bookType, int start, int limited, String distillate);
    BookSortPackage getBookSortPackage();
    BillboardPackage getBillboardPackage();

    AuthorBean getAuthor(String id);
    ReviewBookBean getReviewBook(String id);
    BookHelpfulBean getBookHelpful(String id);

    /******************************/
    List<DownloadTaskBean> getDownloadTaskList();
}
