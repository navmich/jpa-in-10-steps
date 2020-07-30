package com.mike.jpain10steps.service;

import com.mike.jpain10steps.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
// runner slouzi k tomu, abychom neco spustili pri startu aplikace
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        userRepository.save(user);
        // New User is created: User{id=1, name='Jack', role='Admin'}
        log.info("New User is created: " + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved: " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All users: " + user);
    }
}
