package com.nx.user.converter;

import com.nx.dto.UserDto;
import com.nx.user.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConverter {
    UserDto entityToDto(User user);
}
