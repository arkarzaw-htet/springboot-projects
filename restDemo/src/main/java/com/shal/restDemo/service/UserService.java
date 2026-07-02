package com.shal.restDemo.service;

import com.shal.restDemo.dto.CreateUserDto;
import com.shal.restDemo.dto.UserDto;
import com.shal.restDemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository  userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<UserDto> getAllUsers(){
        return this.userRepository.getAllUsers();

    }

    public UserDto getUserById(String id) {
         return this.userRepository.getUserById(id);
    }

    public UserDto createUser(CreateUserDto createUserDto, String string) {
        return this.userRepository.createUser(createUserDto, string);
    }
}
