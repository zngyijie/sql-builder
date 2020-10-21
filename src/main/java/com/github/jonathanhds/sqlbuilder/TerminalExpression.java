package com.github.jonathanhds.sqlbuilder;

import java.sql.SQLException;
import java.util.List;

import com.github.jonathanhds.sqlbuilder.select.RowMapper;

public interface TerminalExpression {
    <E> List<E> list(RowMapper<E> rowMapper) throws SQLException;

    <E> E single(RowMapper<E> rowMapper) throws SQLException;
}
