/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.interfile.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.interfile.entities.AddressDetails;

/**
 *
 * @author elias
 */
@Stateless
public class AddressDetailsFacade extends AbstractFacade<AddressDetails> {

@PersistenceContext(unitName = "interfilePU")    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressDetailsFacade() {
        super(AddressDetails.class);
    }
    
}
