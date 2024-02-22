package com.HibernateRelation.HibernateRelation.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class AuthorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="author_id")
    private int authorId;
    private String authorName;
    
    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonManagedReference
    private AuthorAddress address;

}
//@Entity
//@Data
//public class AuthorEntity {
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name="author_id")
//private int authorid;
//private String name;
//@OneToOne(mappedBy = "entity", cascade = CascadeType.ALL)
//@JsonManagedReference
//private AuthorAddress adress;
////private List<AuthorBooks> books;
//}
