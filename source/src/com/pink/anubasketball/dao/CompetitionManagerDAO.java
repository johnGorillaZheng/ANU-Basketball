package com.pink.anubasketball.dao;

import com.pink.anubasketball.bean.CompetitionManager;

public interface CompetitionManagerDAO {
    public CompetitionManager getManagerByUserName(String userName);
}
