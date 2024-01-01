package com.kindsonthegenius.friendsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {

    @Autowired
    private  FriendService service;

    @GetMapping("/friends")
    public List<Friend> getFriends(){

        return  service.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(Friend friend)
    {
        service.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend)
    {
        service.updateFriend(friend);
    }
    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Integer id, @RequestBody Friend friend)
    {
        service.deleteFriend(id);
    }

}
