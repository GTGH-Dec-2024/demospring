package com.teomaik.demospring;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teomaik.demospring.books.Book;

public class Examples {

	public Examples() {
	}

	public void JsonSerialization() {
		Book book = new Book("booktitle", "authorb", "bookpub", 1995, new ArrayList<String>());

		// Serialization
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonString = "";
			
			jsonString = mapper.writeValueAsString(book);
			System.out.println("json str: " + jsonString);

//			jsonString = "{\"title\":\"NewTitle\",\"author\":\"newAuthor\",\"publiser\":\"bookpub\",\"publishYear\":1995,\"theme\":[]}";
			Book object = mapper.readValue(jsonString, Book.class);
			System.out.println("object.tostring : " + object.toString());
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
