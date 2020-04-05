package com.xxh.test;

public class TestMain {
    public static void main(String[] args) {
        //实体
        People people = new People();
        //工具类
        SqlGenerator sqlGenerator = new SqlGenerator();
        //生成的sql
        String sql = sqlGenerator.generateSql(people.getClass().getName(),"testTable","id",null);

        System.out.println(sql);
    }
}
