package com.jdd.free.ireader.event;

import com.jdd.free.ireader.model.flag.BookDistillate;
import com.jdd.free.ireader.model.flag.BookSort;
import com.jdd.free.ireader.model.flag.BookType;
import com.jdd.free.ireader.utils.Constant;

/**
 * Created by jdd on 17-4-21.
 */

public class SelectorEvent {

    public BookDistillate distillate;

    public BookType type;

    public BookSort sort;

    public SelectorEvent(BookDistillate distillate,
                         BookType type,
                         BookSort sort) {
        this.distillate = distillate;
        this.type = type;
        this.sort = sort;
    }
}
