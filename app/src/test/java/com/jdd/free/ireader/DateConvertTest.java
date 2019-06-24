package com.jdd.free.ireader;

import com.jdd.free.ireader.utils.Constant;
import com.jdd.free.ireader.utils.StringUtils;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by jdd on 17-4-22.
 */

public class DateConvertTest{

    @Test
    public void testDate(){
        String date = "2017-04-22T13:20:19.700Z";
        String pattern = Constant.FORMAT_BOOK_DATE;
        String value = StringUtils.dateConvert(date,pattern);
        System.out.print(value);
    }
}
