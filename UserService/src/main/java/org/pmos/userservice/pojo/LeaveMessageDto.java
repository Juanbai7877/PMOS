package org.pmos.userservice.pojo;

import lombok.Data;

/**
 * @author ALL
 * @date 2024/5/26
 * @Description
 */
@Data
public class LeaveMessageDto {
    private long leaveMessageId;
    private long userId;
    private long fromUserId;
    private java.sql.Timestamp messageTime;
    private String title;
    private String content;
    private String nickName;
}
