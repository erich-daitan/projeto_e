package puc.projetoe.repository;

import org.springframework.data.repository.CrudRepository;

import puc.projetoe.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
