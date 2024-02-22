package com.HibernateRelation.HibernateRelation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AuthorBooks {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String bookname;
private AuthorEntity entity;
}
