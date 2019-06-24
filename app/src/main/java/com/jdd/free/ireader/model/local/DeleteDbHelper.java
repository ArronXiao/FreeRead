package com.jdd.free.ireader.model.local;

import com.jdd.free.ireader.model.bean.AuthorBean;
import com.jdd.free.ireader.model.bean.ReviewBookBean;
import com.jdd.free.ireader.model.bean.BookCommentBean;
import com.jdd.free.ireader.model.bean.BookHelpfulBean;
import com.jdd.free.ireader.model.bean.BookHelpsBean;
import com.jdd.free.ireader.model.bean.BookReviewBean;

import java.util.List;

/**
 * Created by jdd on 17-4-28.
 */

public interface DeleteDbHelper {
    void deleteBookComments(List<BookCommentBean> beans);
    void deleteBookReviews(List<BookReviewBean> beans);
    void deleteBookHelps(List<BookHelpsBean> beans);
    void deleteAuthors(List<AuthorBean> beans);
    void deleteBooks(List<ReviewBookBean> beans);
    void deleteBookHelpful(List<BookHelpfulBean> beans);
    void deleteAll();
}
