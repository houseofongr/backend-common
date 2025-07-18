package com.hoo.common.internal.api;

import com.hoo.common.enums.Authority;
import com.hoo.common.internal.api.dto.FileInfo;

import java.util.List;
import java.util.UUID;

public interface ChangeFileMetadataAPI {
    FileInfo changeFileOwner(UUID fileID, UUID ownerID);

    List<FileInfo> changeFileOwner(List<UUID> fileIDs, UUID ownerID);

    FileInfo changeFileAuthority(UUID fileID, Authority authority);

    List<FileInfo> changeFileAuthority(List<UUID> fileIDs, Authority authority);
}
