package com.pink.anubasketball.service;

import com.pink.anubasketball.model.CompetitionManager;

public interface CompetitionManagerService {

    public CompetitionManager signIn(String username,String password);
    
    public CompetitionManager signUp(CompetitionManager competitionManager);
    
}
