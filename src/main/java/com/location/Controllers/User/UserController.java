package com.location.Controllers.User;

import com.location.Models.AppUser.User;
import com.location.Services.User.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    private AuthService authService;

    public UserController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping(path = "/auth")
    public List<User> User(){
        return authService.listUsers();
    }
}
