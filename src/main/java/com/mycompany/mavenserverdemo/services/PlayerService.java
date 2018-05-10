/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenserverdemo.services;

import com.mycompany.mavenserverdemo.models.*;
import com.mycompany.mavenserverdemo.repository.PlayerRepository;
import com.mycompany.mavenserverdemo.repository.TeamRepoFake;
import com.mycompany.mavenserverdemo.repository.TeamRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annafock
 */
public class PlayerService {

    PlayerRepository playerRepository = new PlayerRepository();
    
    //Skapa objekt av TeamService för att kunna använda metoder här
    //men egentligen ska vi undvika att skapa objekt av modellklasser i modellklasser
    //för klasserna ska inte vara beroende av varandra
    TeamService ts = new TeamService();
    
    public List<Player> getPlayers(int id) {
    
      return ts.getTeam(id).getPlayers();  

        
    }
}
