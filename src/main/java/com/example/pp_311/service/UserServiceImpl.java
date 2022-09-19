package com.example.pp_311.service;

import com.example.pp_311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

        // стартовая таблица лиу
        userRepository.save(new User("Пётр", "Первый", 44));
        userRepository.save(new User("Николай", "Второй", 350));
        userRepository.save(new User("Alexandr", "Tretiy", 41));
        userRepository.save(new User("Иван", "Грозный", 23));
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public void updateUserById(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}