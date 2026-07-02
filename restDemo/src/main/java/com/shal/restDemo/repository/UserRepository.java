package com.shal.restDemo.repository;

import com.shal.restDemo.dto.CreateUserDto;
import com.shal.restDemo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {
    public UserRepository() {
        users.add(new UserDto(UUID.randomUUID().toString(),"Ankit","akb.com"));
        users.add( new UserDto(UUID.randomUUID().toString() ,"Ak", "abc.k.com"));
        users.add(new UserDto(UUID.randomUUID().toString(),"Hello","abkkk.com"));
    }

    List<UserDto> users = new ArrayList<>();
    public List<UserDto> getAllUsers(){
        return this.users;
    }

    public UserDto getUserById(String id) {
        for(UserDto user : users){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public UserDto createUser(CreateUserDto createUserDto, String string) {
        users.add(new UserDto(string, createUserDto.getName(), createUserDto.getEmail()));

        return null;
    }
}
