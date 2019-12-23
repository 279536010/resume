package com.nx.user.converter;

import com.nx.dto.UserDto;
import com.nx.user.entity.User;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2019-12-23T16:37:27+0800",
        comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public UserDto entityToDto(User user) {
        if (user == null) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername(user.getUsername());

        return userDto;
    }
}
