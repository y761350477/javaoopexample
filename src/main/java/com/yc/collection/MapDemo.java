package com.yc.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map遍历的简单使用
 *
 * @auther YC
 * @create 2018-03-05 16:54
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");

        // Map的循环方法
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println("key: " + stringStringEntry.getKey() + ",\tvalue: " + stringStringEntry.getValue());
        }

        // Map只获取Value值的方法
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
