package com.book.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Books;

public interface IBookRepository extends JpaRepository<Books, Integer>{

}
