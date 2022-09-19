package com.example.pp_311.service;

import com.example.pp_311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Надо отдельную папку Repository или можно в сервисе?

public interface UserRepository extends JpaRepository<User, Long> {
}
