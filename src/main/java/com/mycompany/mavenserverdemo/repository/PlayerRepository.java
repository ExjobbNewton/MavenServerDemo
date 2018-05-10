/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenserverdemo.repository;

import com.mycompany.mavenserverdemo.models.Player;
import java.util.List;
import org.hibernate.Session;

public class PlayerRepository {

    public List<Player> getPlayers(int id) {
        Session session = HibernateUtil.getSession();
        List<Player> players = session.createCriteria(Player.class).list();

        session.close();

        return players;
    }
}
