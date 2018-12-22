package main.java.dao;

import main.java.pojo.Soldiers;
import main.java.tools.util.JDBCUtil;
import main.java.tools.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SoldierDaoImpl implements ISoldierDao {
    @Override
    public List<Soldiers> getlLists() {
        return JDBCUtil.executeQuery("select * from soldiers", new RowMap<Soldiers>() {
            @Override
            public Soldiers RowMaping(ResultSet rs) {
                Soldiers s = new Soldiers();
                try {
                    s.setId(rs.getInt("id"));
                    s.setName(rs.getString("name"));
                    s.setAge(rs.getString("age"));
                    s.setImg(rs.getString("img"));
                    s.setAddress(rs.getString("address"));
                    s.setUnit(rs.getString("unit"));
                    s.setRank(rs.getString("rank"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return s;
            }
        },null);
     }

}
