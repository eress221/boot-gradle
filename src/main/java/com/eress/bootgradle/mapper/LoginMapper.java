package com.eress.bootgradle.mapper;

import com.eress.bootgradle.model.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    UserDTO getUserInfo(UserDTO resUser) throws Exception;
}
