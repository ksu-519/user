package ru.kcher.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kcher.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
