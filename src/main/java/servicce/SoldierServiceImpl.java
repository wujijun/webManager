package main.java.servicce;

import main.java.dao.ISoldierDao;
import main.java.dao.SoldierDaoImpl;
import main.java.pojo.Soldiers;

import java.util.List;

public class SoldierServiceImpl implements ISoldierService {
   private ISoldierDao dao = new SoldierDaoImpl();

    @Override
    public List<Soldiers> getlLists() {
        return dao.getlLists();
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
