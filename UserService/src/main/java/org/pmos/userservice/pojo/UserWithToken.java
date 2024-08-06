package org.pmos.userservice.pojo;

import lombok.Data;

/**
 * @author ALL
 * @date 2024/5/9
 * @Description
 */
@Data
public class UserWithToken {
    private Long userId;
    private String userName;
    private String nickName;
    private String token;
}
