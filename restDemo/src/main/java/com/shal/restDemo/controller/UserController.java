package com.shal.restDemo.controller;

import com.shal.restDemo.dto.CreateUserDto;
import com.shal.restDemo.dto.UserDto;
import com.shal.restDemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserDto> getAllUsers(){
        return this.userService.getAllUsers();

    }
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id){
        return this.userService.getUserById(id);

    }
    @PostMapping
    public UserDto createUser(@RequestBody CreateUserDto createUserDto){
        return  userService.createUser(createUserDto, UUID.randomUUID().toString());

    }

}
