package main.java.servicce;

import main.java.pojo.Rank;

import java.util.List;

public interface IRankService {
    public List<Rank> getlLists();
    public int add(Rank rank);
    public int delete(int id);
    public  Rank getone(int id);
    public  int update(Rank rank);
}
