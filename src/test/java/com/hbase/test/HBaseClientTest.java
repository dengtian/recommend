package com.hbase.test;

import cn.hutool.core.collection.CollectionUtil;
import com.hbase.HBaseClient;

import java.util.List;

public class HBaseClientTest {
    public static void main(String[] args) {

        try {
            HBaseClient.createTable("test1", "col");

            HBaseClient.putData("test1", "row1", "col", "name", "hello");


            List<String> test = HBaseClient.getAllKey("test1");
            if (CollectionUtil.isNotEmpty(test)) {
                test.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
