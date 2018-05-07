package com.pink.anubasketball.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pink.anubasketball.dao.CompetitionManagerDao;
import com.pink.anubasketball.model.CompetitionManager;
import com.pink.anubasketball.service.CompetitionManagerService;

@Service 
public class CompetitionManagerServiceImpl implements CompetitionManagerService{

    @Autowired
    CompetitionManagerDao competitionManagerDao;
    
    @Autowired
    CompetitionManager manager;
    

    @Override
    public CompetitionManager signIn(String username,String password) {
        manager=competitionManagerDao.getManagerByUsername(username);
        if(manager!=null&&password.equals(manager.getPassword()))
            return manager;
        return null;
    }

    @Override
    public CompetitionManager signUp(CompetitionManager competitionManager) {
        manager = competitionManagerDao.getManagerByUsername(competitionManager.getUsername());
        // if username is exist
        if(manager!=null) {
            return null;
        }
        competitionManagerDao.insertManager(competitionManager);
        return competitionManager;
    }


}
