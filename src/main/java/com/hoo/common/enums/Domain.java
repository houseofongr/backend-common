package com.hoo.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Domain {
    USER("user", "users"),
    UNIVERSE("universe", "universes"),
    FILE("file", "files"),
    AUTH("auth", "auth");

    private final String name;
    private final String apiPath;

}
