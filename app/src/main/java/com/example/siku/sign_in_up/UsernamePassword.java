package com.example.siku.sign_in_up;

import java.util.ArrayList;

/**
 * Created by siku on 3/25/17.
 */

class UsernamePasswordList {
    public static ArrayList<UsernamePassword> up_arry_;
    UsernamePasswordList(){
    }

    public static void add(UsernamePassword up){
        up_arry_.add(up);
    }

    public static boolean contains(UsernamePassword up){
        return up_arry_.contains(up);
    }
}


public class UsernamePassword{
    private String username_;
    private String password_;
    UsernamePassword(String username,String password){
        this.password_ = password;
        this.username_ = username;
    }

    @Override
    public boolean equals(Object obj) {
        UsernamePassword up = (UsernamePassword) obj;
        return this.username_.equals(up.username_);
    }
}