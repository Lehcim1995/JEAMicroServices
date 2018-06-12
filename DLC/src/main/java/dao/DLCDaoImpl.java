package dao;

import domain.DLC;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class DLCDaoImpl implements DLCDao
{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public DLC addDLC(DLC dlc) {
        entityManager.persist(dlc);
        return dlc;
    }

    @Override
    public DLC addDLC(
            String dlcName,
            int baseGameId)
    {
        DLC dlc = new DLC(dlcName, baseGameId);

        return addDLC(dlc);
    }

    @Override
    public DLC getDLC(int id) {
        return entityManager.createQuery("SELECT dlc FROM DLC dlc WHERE dlc.id = :id", DLC.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<DLC> getDLCs() {
        return entityManager.createQuery("SELECT dlc FROM DLC dlc", DLC.class)
                .getResultList();
    }

    @Override
    public List<DLC> getDLCByGame(int gameId) {
        return entityManager.createQuery("SELECT dlc FROM DLC dlc WHERE dlc.game = :game", DLC.class)
                            .setParameter("game", gameId)
                            .getResultList();
    }
}
