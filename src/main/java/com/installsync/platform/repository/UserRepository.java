package com.installsync.platform.repository;

import com.installsync.platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    boolean existsUsersByEmail(String email);

    User findByEmail(String email);
}