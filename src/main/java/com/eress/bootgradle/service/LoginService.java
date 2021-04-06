package com.eress.bootgradle.service;

import com.eress.bootgradle.model.UserDTO;

public interface LoginService {

    UserDTO getUserInfo(UserDTO reqUser);
    String loginCheck(UserDTO reqUser, UserDTO resUser);
}
