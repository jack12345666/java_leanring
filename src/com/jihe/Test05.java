package com.jihe;

import java.util.HashMap;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "张三");
        map.put("age", "16");
        map.put("sex", "男");
        map.put("address", "dcfsafasda");
        map.put(null, "lala");
        map.put("gaga", null);

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("sex"));
        System.out.println(map.get("address"));
        System.out.println(map.get(null));
        System.out.println(map.get("gaga"));

        for(String key : map.keySet()) {
            System.out.println("key: " + key + " value:" + map.get(key));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
        }
    }
}
