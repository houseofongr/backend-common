package com.hoo.common.internal.api.file.dto;

import java.util.List;
import java.util.UUID;

public record GetFileInfoCommand(
        List<FileOwnership> fileOwnershipList
) {
    public record FileOwnership(
            UUID fileID,
            UUID ownerID
    ) {

    }
}
