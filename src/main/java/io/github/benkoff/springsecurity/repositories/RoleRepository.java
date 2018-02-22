package io.github.benkoff.springsecurity.repositories;

import io.github.benkoff.springsecurity.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ben Novikov on 2018, February, 22
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
