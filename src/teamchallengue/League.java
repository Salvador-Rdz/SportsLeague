/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamchallengue;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Salvador
 */
public class League <T extends Team> 
{
    private String name;
    int games = 0;
    private ArrayList<T> league = new ArrayList<>();
    
    public League(String name)
    {
        this.name=name;
    }  
    public boolean addTeam(T team)
    {
        if(league.contains(team))
        {
            return false;
        }
        league.add(team);
        return true;
    }
    public int numTeams() {
        return this.league.size();
    }

    public void showLeagueTable()
    {
        Collections.sort(league);
        for(T t: league)
        {
            System.out.println(t.getName()+" : "+t.ranking());
        }
}
}
