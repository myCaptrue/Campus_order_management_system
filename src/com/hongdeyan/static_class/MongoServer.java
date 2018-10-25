package com.hongdeyan.static_class;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import lombok.Setter;

/**
 * 用于连接mongodb的数据库静态类
 */
public class MongoServer {

    //创建MongoDB的客户端
    public static MongoClient mongoClient;
    //对应名称的数据库
    public static MongoDatabase database;

    //初始化数据
    static {
        mongoClient = new MongoClient("localhost", 27017);
        database = mongoClient.getDatabase("campus_order_xx");
    }

}
