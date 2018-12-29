package main.java.dao;

import main.java.pojo.Rank;
import main.java.tools.util.JDBCUtil;
import main.java.tools.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RankDaoImpl implements IRankDao {
    @Override
    public List<Rank> getlLists() {
        return JDBCUtil.executeQuery("select * from rank", new RowMap<Rank>() {
            @Override
            public Rank RowMaping(ResultSet rs) {
                Rank r = new Rank();
                try {
                    r.setRank_id(rs.getInt("rank_id"));
                    r.setRank_name(rs.getString("rank_name"));
                    r.setRank_desc(rs.getString("rank_desc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return r;
            }
        }, null);
    }

    @Override
    public List<Rank> getlLists(String name) {
        return JDBCUtil.executeQuery("select * from rank where rank = ?", new RowMap<Rank>() {
            @Override
            public Rank RowMaping(ResultSet rs) {
                Rank r = new Rank();
                try {
                    r.setRank_id(rs.getInt("rank_id"));
                    r.setRank_name(rs.getString("rank_name"));
                    r.setRank_desc(rs.getString("rank_desc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return r;
            }
        }, name);
    }

    @Override
    public int add(Rank rank) {
        return JDBCUtil.executeUpdate("insert into rank(rank_id,rank_name,rank_desc value(?,?,?)",
                rank.getRank_id(),rank.getRank_name(),rank.getRank_desc());
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from rank where id = ?",id);
    }

    @Override
    public Rank getone(int id) {
        return JDBCUtil.getOne("select * from rank where id = ?", new RowMap<Rank>() {
            @Override
            public Rank RowMaping(ResultSet rs) {
                Rank r = new Rank();
                try {
                    r.setRank_id(rs.getInt("rank_id"));
                    r.setRank_name(rs.getString("rank_name"));
                    r.setRank_desc(rs.getString("rank_desc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return r;
            }
        }, id);
    }

    @Override
    public int update(Rank rank) {
        return JDBCUtil.executeUpdate("update rank set rank_id=?, set rank_name=?,set rank_desc=?",
                rank.getRank_id(),rank.getRank_name(),rank.getRank_desc());
    }



}
