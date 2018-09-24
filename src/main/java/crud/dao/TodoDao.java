package crud.dao;

import crud.model.Todo;

import java.util.List;

public interface TodoDao {

    void save(Todo todo);

    void update(Todo todo);

    List<Todo> findAll();

    void delete(Long id);
}
