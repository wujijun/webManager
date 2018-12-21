package main.java.tools.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    T RowMaping(ResultSet rs);
}
