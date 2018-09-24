package crud.dao;

import crud.model.Some;

import java.util.List;

public interface SomeDao {

    void save(Some some);

    void update(Some some);

    List<Some> findAll();

    void delete(Long id);
}
