package org.pmos.userservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Groups {

  @TableId(type = IdType.AUTO)
  private Long groupId;
  private String groupName;
  private Long groupOwner;



}
