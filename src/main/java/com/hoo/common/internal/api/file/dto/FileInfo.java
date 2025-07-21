package com.hoo.common.internal.api.file.dto;

import com.hoo.common.enums.AccessLevel;

import java.net.URI;
import java.util.UUID;

public record FileInfo(
        UUID id,
        URI fileUrl,
        FileMetadata metadata
) {

    public record FileMetadata(
            Long size,
            String name,
            String contentType,
            UUID ownerID,
            AccessLevel accessLevel
    ) {
    }

}
