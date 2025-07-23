package com.hoo.common.enums;

public enum Domain {
    UNIVERSE, USER, FILE, AUTH;

    public String getName() {
        return this.name().toLowerCase();
    };
}
