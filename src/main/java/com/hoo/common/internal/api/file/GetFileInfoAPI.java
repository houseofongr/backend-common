package com.hoo.common.internal.api.file;

import com.hoo.common.internal.api.file.dto.FileInfo;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface GetFileInfoAPI {
    FileInfo getFileInfo(UUID fileID);

    List<FileInfo> getFileInfo(UUID... fileID);

    List<FileInfo> getFileInfo(Collection<UUID> fileIDs);
}
