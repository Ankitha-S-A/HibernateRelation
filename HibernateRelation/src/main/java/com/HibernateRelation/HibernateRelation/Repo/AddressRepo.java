package com.HibernateRelation.HibernateRelation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HibernateRelation.HibernateRelation.Entity.AuthorAddress;

public interface AddressRepo extends JpaRepository<AuthorAddress,Integer>{

}
