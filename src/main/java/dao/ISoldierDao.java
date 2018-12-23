package main.java.dao;

import main.java.pojo.Soldiers;

import java.util.List;

public interface ISoldierDao {
    public List<Soldiers> getlLists();
    public int add(Soldiers soldiers);
    public int delete(int id);
    public  Soldiers getone(int id);
    public  int update(Soldiers soldiers);
}
