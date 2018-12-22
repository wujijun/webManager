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
}
