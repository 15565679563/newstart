package com.wlu.newstart.utils;

import java.util.UUID;

/**
 * 全局工具类
 *
 * @author: wlu
 * @created: 2021/04/13 11:49
 */
public class GlobalUtil {

    public static long getId(){
        SnowFlake snowFlake=new SnowFlake(0, 0);
        return snowFlake.nextId();
    }
}
