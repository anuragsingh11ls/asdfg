package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.anu.usermanagement.core.dao.AbstractDao;

public abstract class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E,I> {

    private Class<E> entityClass;

    protected AbstractDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
	public E findById(I id) {
        return (E) getCurrentSession().get(entityClass, id,LockMode.READ);
    }

    @SuppressWarnings("deprecation")
	public void saveOrUpdate(E e) {
    	//getCurrentSession().lock(e, LockMode.READ);
        getCurrentSession().saveOrUpdate(e);
    }

    public void delete(E e) {
        getCurrentSession().delete(e);
    }
    
   

    public List<E> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
    }
    @SuppressWarnings("unchecked")
	public List<E> findAll(){
		return (List<E>)getCurrentSession().createQuery(" from " +entityClass.getName()).list();
    	
    }
    
	
}
