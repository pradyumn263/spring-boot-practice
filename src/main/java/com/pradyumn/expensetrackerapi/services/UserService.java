package com.pradyumn.expensetrackerapi.services;

import com.pradyumn.expensetrackerapi.domain.User;
import com.pradyumn.expensetrackerapi.exception.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;


}
