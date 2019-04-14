package com.ioc.untils;

import org.apache.commons.lang.ArrayUtils;

public class MyArrayUtils {
    /**
     * @author: sxx
     * @demand: 判断数组中是否包含元素
     * @parameters:
     * @creationDate：
     */
    public static boolean useArrayUtils(String[] arr, String targetValue) {
        return ArrayUtils.contains(arr, targetValue);
    }

    /**
     * @author: sxx
     * @demand: 判断数组中是否包含元素
     * @parameters:
     * @creationDate：
     */
    public static boolean useArrayUtils(Class[] arr, Class targetValue) {
        return ArrayUtils.contains(arr, targetValue);
    }

}
