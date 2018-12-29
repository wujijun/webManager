package main.java.servicce;

import main.java.pojo.Rank;
import main.java.pojo.Result;

import java.util.List;

public interface IRankService {
    public List<Rank> getlLists();
    public List<Rank> getlList(String name);
    public int add(Rank rank);
    public int delete(int id);
    public  Rank getone(int id);
    public  int update(Rank rank);


}
