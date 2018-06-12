package service;

import dao.DLCDao;
import domain.DLC;

import javax.inject.Inject;
import java.util.List;

public class DLCService
{
    @Inject
    private DLCDao dlcDao;

    public DLC addDLC(DLC dlc) {
        return dlcDao.addDLC(dlc);
    }

    public DLC addDLC(
            String dlcName,
            int baseGameId)
    {
        return dlcDao.addDLC(dlcName, baseGameId);
    }

    public DLC getDLC(int id) {
        return dlcDao.getDLC(id);
    }

    public List<DLC> getDLCs() {
        return dlcDao.getDLCs();
    }

    public List<DLC> getDLCByGame(int gameId) {
        return dlcDao.getDLCByGame(gameId);
    }
}
