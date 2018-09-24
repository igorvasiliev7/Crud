package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService extends CrudService<User, Long> {

    User findByEmail();
}
