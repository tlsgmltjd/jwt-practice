package com.jwtpractice.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwtpractice.demo.Entity.User;
import lombok.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;

}
