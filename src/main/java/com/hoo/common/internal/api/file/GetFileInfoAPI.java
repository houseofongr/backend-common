package com.hoo.common.internal.api.file;

import com.hoo.common.internal.api.file.dto.FileInfo;
import com.hoo.common.internal.api.file.dto.GetFileInfoCommand;

import java.util.Collection;
import java.util.List;

public interface GetFileInfoAPI {

    List<FileInfo> getFileInfo(GetFileInfoCommand command);

}
