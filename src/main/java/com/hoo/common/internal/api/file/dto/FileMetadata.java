package com.hoo.common.internal.api.file.dto;

import com.hoo.common.enums.AccessLevel;

public record FileMetadata(
        String domain,
        String contentType,
        String name,
        Long size,
        AccessLevel accessLevel
) {

}
