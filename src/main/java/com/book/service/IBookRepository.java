package com.book.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.book.entity.Books;

public interface IBookRepository extends JpaRepository<Books, Integer>{
	
	
	@Query(value = "SELECT * FROM books.books WHERE a_id=?1", nativeQuery = true)
	public Optional<Books> findByaId(Integer aid);
	
	
	

}
