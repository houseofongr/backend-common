package com.hoo.common.internal.api;

import com.hoo.common.internal.api.dto.UserInfo;

import java.util.UUID;

public interface GetUserInfoAPI {
    UserInfo getUserInfo(UUID userID);
}
