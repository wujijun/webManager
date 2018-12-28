package main.java.dao;

import main.java.pojo.Rank;


import java.util.List;

public interface IRankDao {
    public List<Rank> getlLists();
    public int add(Rank rank);
    public int delete(int id);
    public  Rank getone(int id);
    public  int update(Rank rank);

}
