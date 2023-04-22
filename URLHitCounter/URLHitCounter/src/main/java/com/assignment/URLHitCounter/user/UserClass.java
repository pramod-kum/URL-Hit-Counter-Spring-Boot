package com.assignment.URLHitCounter.user;

import org.springframework.stereotype.Component;

@Component
public class UserClass {
    private String userName;
    private int hitCount=0;

//    public UserClass(String userName, int hitCount) {
//        this.userName = userName;
//        this.hitCount = hitCount;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
