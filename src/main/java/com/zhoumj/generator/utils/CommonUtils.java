package com.zhoumj.generator.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mengjie.zhou
 * @version 1.00
 * @date 六月-30-2016,11:33
 * @description
 */
public class CommonUtils {

    public static String now(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
