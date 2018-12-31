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

    @Override
    public List<Soldiers> getlList(String rank) {
        return JDBCUtil.executeQuery("select * from soldiers where rank = ?", new RowMap<Soldiers>() {
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
        },rank);
    }

    @Override
    public List<Soldiers> getlListU(String unit) {
        return JDBCUtil.executeQuery("select * from soldiers where unit = ?", new RowMap<Soldiers>() {
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
        },unit);
    }

    @Override
    public int add(Soldiers soldiers) {
        return JDBCUtil.executeUpdate("insert into soldiers(name,age,img,address,unit,rank) value(?,?,?,?,?,?)",
                soldiers.getName(),soldiers.getAge(),soldiers.getImg(),soldiers.getAddress(),soldiers.getUnit(),soldiers.getRank());
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from soldiers where id = ?",id);
    }

    @Override
    public Soldiers getone(int id) {
        return JDBCUtil.getOne("select * from soldiers where id = ?", new RowMap<Soldiers>() {
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
        }, id);
    }

    @Override
    public int update(Soldiers soldiers) {
        return JDBCUtil.executeUpdate("update soldiers set name =?, age =?, img =?, address =?, unit =?, rank =? where id =?",
                soldiers.getName(),soldiers.getAge(),soldiers.getImg(),soldiers.getAddress(),soldiers.getUnit(),soldiers.getRank(),soldiers.getId());
    }

    @Override
    public int getCount() {
        return JDBCUtil.executeCount("select count(*) from soldiers",null);
    }

    @Override
    public List<Soldiers> getResults(String text) {
        return JDBCUtil.executeQuery("select * from soldiers where name like concat('%',?,'%')", new RowMap<Soldiers>() {
            @Override
            public Soldiers RowMaping(ResultSet rs) {
                Soldiers s =new Soldiers();
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
        }, text);
    }

    @Override
    public List<Soldiers> getlLists(int pageNo, int pageSize) {
        return JDBCUtil.executeQuery("select * from soldiers limit ?,?", new RowMap<Soldiers>() {
            @Override
            public Soldiers RowMaping(ResultSet rs) {
                Soldiers s =new Soldiers();
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
        },(pageNo-1)*pageSize,pageSize);
    }

}
