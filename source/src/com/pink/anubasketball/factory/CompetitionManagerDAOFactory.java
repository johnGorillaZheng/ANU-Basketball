package com.pink.anubasketball.factory;

import com.pink.anubasketball.dao.CompetitionManagerDAO;
import com.pink.anubasketball.daoimpl.CompetitionManagerDAOImpl;

public class CompetitionManagerDAOFactory {
    public static CompetitionManagerDAO getCompetitionManagerDAOInstance() {
        return new CompetitionManagerDAOImpl();
    }
}
