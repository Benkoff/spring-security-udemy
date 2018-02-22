package io.github.benkoff.springsecurity.repositories;

import io.github.benkoff.springsecurity.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Ben Novikov on 2018, February, 22
 */
@Repository
public interface UserRepository {
    User findByUsername(String username);
}
