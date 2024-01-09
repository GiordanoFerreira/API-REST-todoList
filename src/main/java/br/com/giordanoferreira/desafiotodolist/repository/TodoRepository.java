package br.com.giordanoferreira.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.giordanoferreira.desafiotodolist.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
