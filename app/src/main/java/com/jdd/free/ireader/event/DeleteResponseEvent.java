package com.jdd.free.ireader.event;

import com.jdd.free.ireader.model.bean.CollBookBean;

/**
 * Created by jdd on 17-5-27.
 */

public class DeleteResponseEvent {
    public boolean isDelete;
    public CollBookBean collBook;
    public DeleteResponseEvent(boolean isDelete,CollBookBean collBook){
        this.isDelete = isDelete;
        this.collBook = collBook;
    }
}
