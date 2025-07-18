package com.hoo.common.internal.api.dto;

import com.hoo.common.enums.Authority;
import com.hoo.common.enums.FileType;

import java.util.UUID;

public record UploadFileCommand(
        UUID id,
        UUID ownerID,
        Long size,
        String realName,
        String fileSystemName,
        FileType fileType,
        Authority authority
) {
}
