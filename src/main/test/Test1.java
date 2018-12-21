package main.test;

import main.java.pojo.Soldiers;
import main.java.tools.util.JDBCUtil;
import main.java.tools.util.RowMap;
import org.omg.CORBA.Object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test1{
    public Soldiers getOne(int id){
      return  JDBCUtil.getOne("select * from soldiers where id=?", new RowMap<Soldiers>() {
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
        },id);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();

        System.out.println(t.getOne(2));
    }
}
