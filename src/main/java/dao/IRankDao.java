package dao;


import pojo.Rank;

import java.util.List;

public interface IRankDao {
    public List<Rank> getlLists();
    public List<Rank> getlLists(String name);
    public int add(Rank rank);
    public int delete(int id);
    public  Rank getone(int id);
    public  int update(Rank rank);

}
