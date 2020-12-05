package com.wang;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestTX {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","wang");

        // 开启事务
        Transaction multi = jedis.multi();
        String result = jsonObject.toJSONString();

        try {

            multi.set("user1", result);
            multi.set("user2", result);
            int i = 1/0;
            multi.exec(); // 执行事务

        } catch (Exception e) {

            multi.discard();// 放弃事务
            e.printStackTrace();

        } finally {
            System.out.println(jedis.get("user1"));
            jedis.close();
        }
    }

}