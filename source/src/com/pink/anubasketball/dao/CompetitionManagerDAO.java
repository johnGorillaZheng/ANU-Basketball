package com.pink.anubasketball.dao;

import com.pink.anubasketball.bean.CompetitionManagerDO;

public interface CompetitionManagerDAO {
    public CompetitionManagerDO getManagerByUserName(String userName);
}
