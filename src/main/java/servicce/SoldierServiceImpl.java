package servicce;


import dao.ISoldierDao;
import dao.SoldierDaoImpl;
import pojo.Result;
import pojo.Soldiers;

import java.util.List;

public class SoldierServiceImpl implements ISoldierService {
   private ISoldierDao dao =  new SoldierDaoImpl();

    @Override
    public List<Soldiers> getlLists() {
        return dao.getlLists();
    }

    @Override
    public List<Soldiers> getlList(String rank) {
        return dao.getlList(rank);
    }

    @Override
    public List<Soldiers> getlListU(String unit) {
        return dao.getlListU(unit);
    }

    @Override
    public Result getlLists(int pageNo, int pageSize) {
        Result data = new Result(pageNo,pageSize,dao.getCount());
        data.setLists(dao.getlLists(pageNo,pageSize));
        return  data;
    }

    @Override
    public int add(Soldiers soldiers) {
        return dao.add(soldiers);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Soldiers getone(int id) {
        return dao.getone(id);
    }

    @Override
    public int update(Soldiers soldiers) {
        return dao.update(soldiers);
    }

    @Override
    public List<Soldiers> getResults(String text) {
        return dao.getResults(text);
    }

    @Override
    public Result getLists(int pageNo, int pageSize, String text) {
        Result data = new Result(pageNo,pageSize,dao.getCount(text));
        data.setLists(dao.getlLists(pageNo,pageSize,text));
        return data;
    }
}
