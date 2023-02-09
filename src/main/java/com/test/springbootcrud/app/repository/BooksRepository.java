package com.test.springbootcrud.app.repository;
import org.springframework.data.repository.CrudRepository;

import com.test.springbootcrud.app.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
