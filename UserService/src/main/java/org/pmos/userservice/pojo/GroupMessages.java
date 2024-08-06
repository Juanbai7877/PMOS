package org.pmos.userservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class GroupMessages {
  @TableId(type = IdType.AUTO)
  private Long messageId;
  private Long senderId;
  private Long groupId;
  private String messageText;
  private java.sql.Timestamp messageTime;
  private String messageType;



}
