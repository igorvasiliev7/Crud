package crud.service;

import java.util.List;

public interface CrudService<T, ID> {

    void save(T entity);

    void update(T entity);

    default List<T> findAll() {
        return null;
    }

    default List<T> findAll(int page) {
        return null;
    }

    void delete(ID id);
}
