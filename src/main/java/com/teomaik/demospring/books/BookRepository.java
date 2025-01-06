package com.teomaik.demospring.books;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByPubliserAndPublishYearLessThanEqual(String publiser, int publishYear);
	
}
