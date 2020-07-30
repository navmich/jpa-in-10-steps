package com.mike.jpain10steps.service;

import com.mike.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// oznaceni klasy, ktera je typu DAO - Data Access Object
@Repository
// kazda metoda tridy bude jedna transakce (anotace jde i na samotnou metodu)
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
