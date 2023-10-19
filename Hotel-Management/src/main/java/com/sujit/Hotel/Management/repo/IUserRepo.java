package com.sujit.Hotel.Management.repo;

import com.sujit.Hotel.Management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByEmail(String newEmail);
}
