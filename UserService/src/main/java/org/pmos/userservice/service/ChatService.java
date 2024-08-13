package org.pmos.userservice.service;

import org.pmos.userservice.pojo.LeaveMessage;
import org.pmos.userservice.pojo.Result;

/**
 * @author ALL
 * @date 2024/4/23
 * @Description
 */
public interface ChatService {

    Result getAllPrivateMessage(Long userId);

    Result getPrivateMessage(Long userId, Long sendUserId);

    Result getGroupsMessage(Long userId, Long groupId);

    Result sendPrivateMessage(Long userId, Long toUserId, String msg);

    Result sendGroupsMessage(Long userId, Long toGroupId, String msg);

    Result searchPrivateMessage(Long userId, Long toUserId, Long nums);

    Result searchGroupsMessage(Long userId, Long groupId, Long nums);

    Result getPrivateMessageBynum(Long userId, Long sendUserId);

    Result leaveMessage(LeaveMessage leaveMessage);

    Result getLeaveMessage(Long messageId);

    Result getAllLeaveMessage(Long userId);
}
