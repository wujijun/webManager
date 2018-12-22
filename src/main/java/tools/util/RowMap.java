package main.java.tools.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    public T RowMaping(ResultSet rs);
}
