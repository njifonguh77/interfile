/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.interfile.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.interfile.entities.Statement;

/**
 *
 * @author elias
 */
@Stateless
public class StatementFacade extends AbstractFacade<Statement> {

@PersistenceContext(unitName = "interfilePU")    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StatementFacade() {
        super(Statement.class);
    }
    
}
