package org.pmos.userservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Friends {
  @TableId(type = IdType.AUTO)
  private Long friendId;
  private Long userId1;
  private Long userId2;
  private String status;
  private Integer messageNum;
}
