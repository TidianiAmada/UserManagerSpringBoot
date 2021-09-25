package com.saraya.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.entity.UserInformation;

@Repository("userRepo")
public interface UserRepo extends JpaRepository<UserInformation, String> {


}
