package com.example.demo.repo;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findUserModelByEmail(String email);
}
