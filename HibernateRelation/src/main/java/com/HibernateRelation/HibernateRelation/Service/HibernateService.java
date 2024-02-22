package com.HibernateRelation.HibernateRelation.Service;

import java.util.List;

import com.HibernateRelation.HibernateRelation.Entity.AuthorEntity;

public interface HibernateService {

	public boolean Save(AuthorEntity entity);
	
	public boolean Update(AuthorEntity entity1);
	
	public boolean SaveAll(List<AuthorEntity> listentity);
	
	public AuthorEntity Getbyid(int id);
	
	public List<AuthorEntity> GetAll();
	
	public boolean DeleteById(int id);
	
	public boolean DeleteAll();
}
