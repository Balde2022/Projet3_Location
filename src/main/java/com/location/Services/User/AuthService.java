package com.location.Services.User;

import com.location.Models.AppUser.User;

import java.util.List;

public interface AuthService {
    User addNewUser(User user);
    User loadUserByEmail(String email);
    List<User> listUsers();
}
