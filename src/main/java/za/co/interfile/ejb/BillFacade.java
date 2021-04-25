/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.interfile.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import za.co.interfile.entities.Account;
import za.co.interfile.entities.Bill;

/**
 *
 * @author elias
 */
@Stateless
public class BillFacade extends AbstractFacade<Bill> {

    @PersistenceContext(unitName = "interfilePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BillFacade() {
        super(Bill.class);
    }

    public double calculateOutstanding(Account account) {
        String sql = "SELECT b FROM Bill b WHERE b.account = :account ";
        TypedQuery query = getEntityManager().createQuery(sql, Bill.class);
        query.setParameter("account", account);
        List<Bill> bills = query.getResultList();
        double outstanding = 0;
        for (Bill bill : bills) {
            outstanding += bill.getOutstanding().doubleValue();
        }
        return outstanding;
    }

}
