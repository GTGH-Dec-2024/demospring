package com.teomaik.demospring.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.teomaik.demospring.authors.Author;
import com.teomaik.demospring.authors.AuthorRepository;
import com.teomaik.demospring.authors.AuthorServices;
import com.teomaik.demospring.themes.Theme;
import com.teomaik.demospring.themes.ThemeServices;

@Service
public class BookServices {

//	@Autowired
//	AuthorServices authorServices;
//	@Autowired
//	ThemeServices themeServices;

	@Autowired BookRepository repository;
	@Autowired AuthorRepository authorRepository;


	//TODO add method getWithID
	
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	public List<Book> addBook(Book book) {
		repository.save(book);
		return repository.findAll();

	}

	public List<Book> removeBook(Integer id) {
		repository.deleteById(id);
		return repository.findAll();
	}

	public Book updateBook(int id, String title, Author author, String publiser, int publishYear,
			String description, Set<Theme> theme) {
		
		Optional<Book> optionalBook = repository.findById(id);
        
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();

				if (title != null)
					book.setTitle(title);
				if (author != null)
					book.setAuthor(author);
				if (publiser != null)
					book.setPubliser(publiser);
				if (publishYear > 0)
					book.setPublishYear(publishYear);
				if (description != null)
					book.setDescription(description);
//				if (theme != null)
//					book.setTheme(theme);
		
				// Save and return the updated book
		        return repository.save(book);
	    } else {
	        throw new RuntimeException("Book with ID " + id + " not found");
	    }
	}

//    public Book addTheme(Integer id, Integer themeId){
//        for(Book book :books) {
//            if (book.getId() == id){
//                for(Theme theme: themeServices.getAllThemes()){
//                    if (theme.getId() == themeId){
//                    	book.addTheme(theme);
//                    }
//                }
//            }
//            return book;
//        }
//		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book with id " + id + "or Theme with id " + themeId + " dosnt exist");
//    }
//
    public Book changeAuthor(Integer id, Integer authorId){
    	
		Optional<Book> optionalBook = repository.findById(id);
        Optional<Author> optAuthor = authorRepository.findById(authorId);
        
        if (optionalBook.isPresent() && optAuthor.isPresent()) {
        	Book book = optionalBook.get();
        	Author author = optAuthor.get();
        	
        	book.setAuthor(author);
	        return repository.save(book);
        } else {
	        throw new RuntimeException("Book with ID: " + id + " or Author with ID: "+ authorId +" not found");
	    }
		
	}

}
