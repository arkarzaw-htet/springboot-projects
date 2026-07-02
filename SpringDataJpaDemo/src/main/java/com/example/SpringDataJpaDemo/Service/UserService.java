package com.example.SpringDataJpaDemo.Service;

import com.example.SpringDataJpaDemo.UserDto.CreateUserDto;
import com.example.SpringDataJpaDemo.UserDto.UserDto;
import com.example.SpringDataJpaDemo.entities.User;
import com.example.SpringDataJpaDemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userReository;

    public UserDto saveUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setEmail(createUserDto.getEmail());
        user.setName(createUserDto.getName());
        User savedUser = userReository.save(user);
        return new UserDto(savedUser.getId(), savedUser.getName(), savedUser.getEmail());


    }

}
