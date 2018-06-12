package dao;

import domain.DLC;

import java.util.List;

public interface DLCDao
{
    DLC addDLC(DLC dlc);

    DLC addDLC(String dlcName, int baseGameId);

    DLC getDLC(int id);

    List<DLC> getDLCs();

    List<DLC> getDLCByGame(int gameId);
}
