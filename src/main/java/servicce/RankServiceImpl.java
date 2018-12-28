package main.java.servicce;

import main.java.dao.IRankDao;
import main.java.dao.RankDaoImpl;
import main.java.pojo.Rank;

import java.util.List;

public class RankServiceImpl implements IRankService {
    private IRankDao dao =new RankDaoImpl();
    @Override
    public List<Rank> getlLists() {
        return dao.getlLists();
    }

    @Override
    public int add(Rank rank) {
        return dao.add(rank);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Rank getone(int id) {
        return dao.getone(id);
    }

    @Override
    public int update(Rank rank) {
        return dao.update(rank);
    }
}
