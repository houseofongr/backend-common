package com.hoo.common.internal.api.file.dto;

import com.hoo.common.enums.AccessLevel;

import java.io.InputStream;
import java.util.UUID;

public record UploadFileCommand(
        FileSource fileSource,
        Metadata metadata
) {

    public record FileSource(
            InputStream inputStream,
            String contentType,
            String name,
            Long size
    ) {
    }

    public record Metadata(
            String domain,
            UUID ownerID,
            AccessLevel accessLevel
    ) {

    }
}
