package com.HibernateRelation.HibernateRelation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HibernateRelation.HibernateRelation.Entity.AuthorEntity;

public interface AuthorRepo extends JpaRepository<AuthorEntity,Integer> {

}
