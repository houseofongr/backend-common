package com.hoo.common.internal.api.dto;

import java.util.UUID;

public record UserInfo(
        UUID id,
        Boolean termsOfUseConsent,
        Boolean personalInfoConsent,
        String email,
        String nickname,
        String userType,
        String userStatus,
        Long registeredAt
) {
}
