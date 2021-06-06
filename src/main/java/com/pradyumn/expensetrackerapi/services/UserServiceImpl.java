package com.pradyumn.expensetrackerapi.services;

import com.pradyumn.expensetrackerapi.domain.User;
import com.pradyumn.expensetrackerapi.exception.EtAuthException;

public class UserServiceImpl implements UserService{
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
