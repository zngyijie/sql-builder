package com.github.jonathanhds.sqlbuilder.builder;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.github.jonathanhds.sqlbuilder.Database;

public class QueryBuilderHSQLDB extends QueryBuilder {

    public QueryBuilderHSQLDB(Connection connection) {
        super(Database.HSQLDB, connection);
    }

    public QueryBuilderHSQLDB(DataSource dataSource) throws SQLException {
        super(Database.HSQLDB, dataSource);
    }
}
