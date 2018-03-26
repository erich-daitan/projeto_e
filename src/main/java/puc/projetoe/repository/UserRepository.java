package puc.projetoe.repository;

import org.springframework.data.repository.CrudRepository;

import puc.projetoe.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
