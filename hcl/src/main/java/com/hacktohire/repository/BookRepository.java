package com.hacktohire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hacktohire.entity.BookEntity;

public interface BookRepository 
extends CrudRepository<BookEntity, String> 
{
	@Query("Select * from Books"+" where title=:title")
	
	public List<BookEntity> findByName(
			
			@Param("title") String title);
}
