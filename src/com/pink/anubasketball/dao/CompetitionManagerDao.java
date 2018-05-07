package com.pink.anubasketball.dao;

import com.pink.anubasketball.model.CompetitionManager;

public interface CompetitionManagerDao {
    public int insertManager(CompetitionManager competitionManager);

    public CompetitionManager getManagerById(int id);
    
    public CompetitionManager getManagerByUsername(String username);
}
