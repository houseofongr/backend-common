package com.hoo.common.internal.api.user;

import com.hoo.common.internal.api.user.dto.UserInfo;

import java.util.UUID;

public interface GetUserInfoAPI {
    UserInfo getUserInfo(UUID userID);
}
