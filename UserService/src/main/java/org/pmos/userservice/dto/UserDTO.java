package org.pmos.userservice.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String nickName;
    private String avatarUrl;
}
