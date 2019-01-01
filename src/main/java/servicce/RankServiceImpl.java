package servicce;


import dao.IRankDao;
import dao.RankDaoImpl;
import pojo.Rank;

import java.util.List;

public class RankServiceImpl implements IRankService {
    private IRankDao dao =new RankDaoImpl();
    @Override
    public List<Rank> getlLists() {
        return dao.getlLists();
    }

    @Override
    public List<Rank> getlList(String name) {
        return dao.getlLists(name);
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
