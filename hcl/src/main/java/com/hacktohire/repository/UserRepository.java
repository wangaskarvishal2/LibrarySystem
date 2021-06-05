package com.hacktohire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hacktohire.entity.BookEntity;
import com.hacktohire.entity.MemberEnity;

public interface UserRepository extends CrudRepository<MemberEnity, String> {

@Query("SELECT Books.id, Books.title, Book.author,Book.category,Book.status,Book.rack" + 
		"FROM Books" + 
		"INNER JOIN Members ON Books.id=Members.id;"+"where Book.status='borrowed'")
	
	public List<BookEntity> findByName(
			
			@Param("memberid") int id);
}
