package crud.dao;

import java.util.List;

public interface CrudDao<T, ID> {

    void save(T entity);

    void update(T entity);

    List<T> findLAll();

    void delete(ID id);
}
