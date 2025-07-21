package com.hoo.common.internal.api.file;

import com.hoo.common.internal.api.file.dto.UploadFileCommand;
import com.hoo.common.internal.api.file.dto.UploadFileResult;

public interface UploadFileAPI {
    UploadFileResult uploadFile(UploadFileCommand request);
}
