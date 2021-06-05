package com.hacktohire.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hacktohire.entity.BookEntity;
import com.hacktohire.mapper.BookMapper;
import com.hacktohire.mapper.MemberMapper;
import com.hacktohire.model.BookModel;
import com.hacktohire.repository.BookRepository;
import com.hacktohire.repository.UserRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	private UserRepository userRepository;
	private BookMapper bookMapper;
	private MemberMapper memberMapper;
	public BookService(BookRepository bookRepository, UserRepository userRepository, BookMapper bookMapper,
			MemberMapper memberMapper) {
		this.bookRepository = bookRepository;
		this.userRepository = userRepository;
		this.bookMapper = bookMapper;
		this.memberMapper = memberMapper;
	}
	
	public List<BookEntity>  getBooks(String title)
	{
		
		return bookRepository.findByName(title);
		
	}

}
