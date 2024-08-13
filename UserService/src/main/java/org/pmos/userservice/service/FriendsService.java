package org.pmos.userservice.service;

import org.pmos.userservice.pojo.Result;

/**
 * @author ALL
 * @date 2024/4/23
 * @Description
 */
public interface FriendsService {
    Result addFriend(Long userId1, Long userId2);

    Result agreeFriend(Long userId1, Long userId2);

    Result disagreeFriend(Long userId1, Long userId2);

    Result addFriendDirect(Long userId1, Long userId2);

    Result getFriendsList(Long userId);

    Result removeFriend(Long userId1, Long userId2);

    Result getFriendApplying(Long userId);
}
