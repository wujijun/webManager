package servicce;

import main.java.dao.ISoldierDao;
import main.java.dao.SoldierDaoImpl;
import main.java.pojo.Result;
import main.java.pojo.Soldiers;

import java.util.List;

public class SoldierServiceImpl implements servicce.ISoldierService {
   private ISoldierDao dao = (ISoldierDao) new SoldierDaoImpl();

    @Override
    public List<Soldiers> getlLists() {
        return dao.getlLists();
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
}
