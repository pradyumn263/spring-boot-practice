package com.pradyumn.expensetrackerapi.repository;

import com.pradyumn.expensetrackerapi.domain.User;
import com.pradyumn.expensetrackerapi.exception.EtAuthException;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findByUserID(Integer userID) {
        return null;
    }
}
