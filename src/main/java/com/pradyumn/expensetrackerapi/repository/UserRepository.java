package com.pradyumn.expensetrackerapi.repository;

import com.pradyumn.expensetrackerapi.domain.User;
import com.pradyumn.expensetrackerapi.exception.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findByUserID(Integer userID);
}


