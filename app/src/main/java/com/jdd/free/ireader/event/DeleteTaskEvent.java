package com.jdd.free.ireader.event;

import com.jdd.free.ireader.model.bean.CollBookBean;

/**
 * Created by jdd on 17-5-27.
 */

public class DeleteTaskEvent {
    public CollBookBean collBook;

    public DeleteTaskEvent(CollBookBean collBook){
        this.collBook = collBook;
    }
}
