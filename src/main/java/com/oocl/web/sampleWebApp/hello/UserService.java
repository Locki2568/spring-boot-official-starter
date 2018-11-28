package com.oocl.web.sampleWebApp.hello;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users;
    private int idIndex = 0;

    public UserService(){
        users = new ArrayList<>();
        save(new User("Xiaoming"));
    }

    public int save(User user){
        this.idIndex = this.idIndex + 1;
        user.setId(idIndex);
        this.users.add(user);
        return idIndex;
    }

    public List<User> getAll(){
        return this.users;
    }
    public User searchEmployeeByID(int id){
        User user = this.users.get(id);
        return user;
    }

}
