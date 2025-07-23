package com.hoo.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CacheKeys {
    EMAIL_AUTHN_CODE_PREFIX("email-authn-code:"),
    EMAIL_AUTHN_STATUS_PREFIX("email-authenticated:"),
    EMAIL_AUTHENTICATED("1"),
    FILE_TEMP_URL_PREFIX("temp-url:"),
    FILE_TOKEN_PREFIX("temp-token:");


    private final String key;
}
