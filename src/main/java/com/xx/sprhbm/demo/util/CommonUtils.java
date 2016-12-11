package com.xx.sprhbm.demo.util;

import java.util.UUID;

/**
 * Created by wxiao on 2016/12/11.
 */
public class CommonUtils {

    /**
     * 生成32位的uuid
     * @return
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }


}
