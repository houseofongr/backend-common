package com.hoo.common.internal.api.file.dto;

import com.hoo.common.enums.AccessLevel;

import java.util.UUID;

public record FileMetadata(
        String domain,
        String contentType,
        String name,
        Long size,
        UUID ownerID,
        AccessLevel accessLevel
) {

}
