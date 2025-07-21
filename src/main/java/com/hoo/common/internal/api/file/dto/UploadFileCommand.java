package com.hoo.common.internal.api.file.dto;

import com.hoo.common.enums.AccessLevel;

import java.io.InputStream;
import java.util.UUID;

public record UploadFileCommand(
        InputStream inputStream,
        FileInfo.FileMetadata fileMetadata
) {

    public static UploadFileCommand from(FileCommand fileCommand, UUID ownerID, AccessLevel accessLevel) {

        return new UploadFileCommand(
                fileCommand.inputStream(),
                new FileInfo.FileMetadata(
                        fileCommand.size(),
                        fileCommand.name(),
                        fileCommand.contentType(),
                        ownerID,
                        accessLevel
                ));
    }
}
