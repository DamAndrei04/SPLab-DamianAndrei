package com.example.splabdamianandrei.repository.adapter;

import com.example.splabdamianandrei.model.entities.Book;
import com.example.splabdamianandrei.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class JpaBookRepositoryAdapter implements BookRepository {
    private final SpringDataBookRepository springDataBookRepository;

    @Override
    public Book save(Book entity){
        return springDataBookRepository.save(entity);
    }

    @Override
    public Optional<Book> findById(Integer id){
        return springDataBookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return springDataBookRepository.findAll();
    }

    @Override
    public  void deleteById(Integer id){
        springDataBookRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id){
        return springDataBookRepository.existsById(id);
    }
}
