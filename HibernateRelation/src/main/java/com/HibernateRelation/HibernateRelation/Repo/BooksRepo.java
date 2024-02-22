package com.HibernateRelation.HibernateRelation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HibernateRelation.HibernateRelation.Entity.AuthorBooks;

public interface BooksRepo extends JpaRepository<AuthorBooks,Integer>{

}
