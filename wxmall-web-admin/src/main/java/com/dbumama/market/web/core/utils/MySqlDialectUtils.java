package com.dbumama.market.web.core.utils;

import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.Table;
import com.jfinal.plugin.activerecord.dialect.Dialect;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by songningning1 on 2017/9/20.
 */
public class MySqlDialectUtils extends Dialect {
    @Override
    public String forTableBuilderDoBuild(String tableName) {
        return null;
    }

    @Override
    public String forPaginate(int pageNumber, int pageSize, String select, String sqlExceptSelect) {
        return null;
    }

    @Override
    public String forModelFindById(Table table, String columns) {
        return null;
    }

    @Override
    public String forModelDeleteById(Table table) {
        return null;
    }

    @Override
    public void forModelSave(Table table, Map<String, Object> attrs, StringBuilder sql, List<Object> paras) {
        sql.append("insert into `").append(table.getName()).append("`(");
        StringBuilder temp = new StringBuilder(") values(");
        for (Map.Entry<String, Object> e: attrs.entrySet()) {
            String colName = e.getKey();
            if (table.hasColumnLabel(colName)) {
                if (paras.size() > 0) {
                    sql.append(", ");
                    temp.append(", ");
                }
                sql.append("`").append(colName).append("`");
                temp.append("?");
                paras.add(e.getValue());
            }
        }
        sql.append(temp.toString()).append(")");
    }

    @Override
    public void forModelUpdate(Table table, Map<String, Object> attrs, Set<String> modifyFlag, StringBuilder sql, List<Object> paras) {

    }

    @Override
    public String forDbFindById(String tableName, String[] pKeys) {
        return null;
    }

    @Override
    public String forDbDeleteById(String tableName, String[] pKeys) {
        return null;
    }

    @Override
    public void forDbSave(String tableName, String[] pKeys, Record record, StringBuilder sql, List<Object> paras) {

    }

    @Override
    public void forDbUpdate(String tableName, String[] pKeys, Object[] ids, Record record, StringBuilder sql, List<Object> paras) {

    }
}
