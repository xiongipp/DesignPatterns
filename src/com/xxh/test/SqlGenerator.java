package com.xxh.test;


import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SqlGenerator {
    public static Map<String, String> property2SqlColumnMap = new HashMap<>();

    static {
        property2SqlColumnMap.put("integer", "INT");
        property2SqlColumnMap.put("short", "tinyint");
        property2SqlColumnMap.put("long", "bigint");
        property2SqlColumnMap.put("bigdecimal", "decimal(19,2)");
        property2SqlColumnMap.put("double", "double precision not null");
        property2SqlColumnMap.put("float", "float");
        property2SqlColumnMap.put("boolean", "bit");
        property2SqlColumnMap.put("timestamp", "datetime");
        property2SqlColumnMap.put("date", "datetime");
        property2SqlColumnMap.put("string", "VARCHAR(40)");
    }


    public static String generateSql(String className,String tableName,String primaryKey,String filePath){
        try {
            Class<?> clz = Class.forName(className);
            className = clz.getSimpleName();
            Field[] fields = clz.getDeclaredFields();
            StringBuffer column = new StringBuffer();
            for (Field f : fields) {
                if (f.getName().equals(primaryKey)){
                    continue;
                }
                //column.append(" \n `"+f.getName()+"`").append(varchar);
                column.append(getColumnSql(f));
            }
            String sqlPrimaryKey =primaryKey;
            StringBuffer sql = new StringBuffer();
            sql.append(" \n CREATE TABLE "+tableName+"  (")
                    .append(" \n "+sqlPrimaryKey+" bigint(20) NOT NULL AUTO_INCREMENT,")
                    .append(" \n "+column)
                    .append(" \n PRIMARY KEY ("+sqlPrimaryKey+")\n)");
            String sqlText = sql.toString();
            StringToSql(sqlText,filePath);
            return sqlText;
        } catch (ClassNotFoundException e) {
//            Log.i("error","SQL生成异常",e);
            return null;
        }
    }

    private static String getColumnSql(Field field){
        String tpl = "\n %s %s DEFAULT NULL,";
        String typeName = field.getType().getSimpleName().toLowerCase();
        String sqlType = property2SqlColumnMap.get(typeName);
        if (sqlType == null || sqlType.isEmpty()){
//            Log.i("error",field.getName() + ":"+field.getType().getName()+" 需要单独创建表");
            return "";
        }
        String column =field.getName();
        String sql = String.format(tpl,column,sqlType.toUpperCase());
        return sql;
    }
    private static void StringToSql(String str,String path){
        byte[] sourceByte = str.getBytes();
        if(null != sourceByte){
            try {
                File file = new File(path);
                if (!file.exists()) {
                    File dir = new File(file.getParent());
                    dir.mkdirs();
                    file.createNewFile();
                }
                FileOutputStream outStream = new FileOutputStream(file);
                outStream.write(sourceByte);
                outStream.flush();
                outStream.close();
                System.out.println("生成成功");
            } catch (Exception e) {
//                Log.i("error","保存SQL文件异常：",e);
            }
        }
    }
}
