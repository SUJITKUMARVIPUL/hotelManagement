package com.sujit.Hotel.Management.repo;

import com.sujit.Hotel.Management.model.AuthToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthToken,Integer> {
    AuthToken findFirstByTokenValue(String tokenValue);
}
