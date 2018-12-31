package main.java.dao;

import main.java.pojo.Soldiers;

import java.util.List;

public interface ISoldierDao {
    public List<Soldiers> getlLists();
    public List<Soldiers> getlList(String rank);
    public List<Soldiers> getlListU(String unit);
    public int add(Soldiers soldiers);
    public int delete(int id);
    public  Soldiers getone(int id);
    public  int update(Soldiers soldiers);
    public int getCount();
    public List<Soldiers>getResults(String text);
    public List<Soldiers> getlLists(int pageNo, int pageSize);
}
