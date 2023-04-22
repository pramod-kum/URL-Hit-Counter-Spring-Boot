package com.assignment.URLHitCounter.service;

import com.assignment.URLHitCounter.user.UserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    @Autowired
    UserClass userClassObj;

    public UserClass CountHit(String useName){
        userClassObj.setUserName(useName);
        int count=userClassObj.getHitCount();

        userClassObj.setHitCount(++count);

        return userClassObj;
    }
}
