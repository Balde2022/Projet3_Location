package com.location.Controllers.User;

import com.location.Models.AppUser.User;
import com.location.Services.User.AuthService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/auth")
public class UserController {
    private AuthService authService;

    public UserController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping(path = "/users")
    public List<User> User(){
        return authService.listUsers();
    }

    @PostMapping(path = "/register")
    public User register(@RequestBody User user){
       return authService.addNewUser(user);
    }
}
