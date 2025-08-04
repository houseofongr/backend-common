package com.hoo.common.internal.api;

import com.hoo.common.enums.AccessLevel;

import java.io.InputStream;
import java.util.UUID;

public record FileSource(
        InputStream inputStream,
        String contentType,
        String name,
        Long size,
        String domain,
        UUID ownerID,
        AccessLevel accessLevel
) {
}
