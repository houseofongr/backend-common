package com.hoo.common.internal.api.auth;

public interface RegisterBusinessUserCredentialAPI {
    void saveBusinessUserPassword(String email, String password);
}
