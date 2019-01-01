package servicce;


import pojo.Result;
import pojo.Soldiers;

import java.util.List;

public interface ISoldierService {
    public List<Soldiers> getlLists();
    public List<Soldiers> getlList(String rank);
    public List<Soldiers> getlListU(String unit);
    public Result getlLists(int pageNo, int pageSize);
    public int add(Soldiers soldiers);
    public int delete(int id);
    public  Soldiers getone(int id);
    public  int update(Soldiers soldiers);
    public List<Soldiers> getResults(String text);
    public Result getLists(int pageNo,int pageSize,String text);
}
