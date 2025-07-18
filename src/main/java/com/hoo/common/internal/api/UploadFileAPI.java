package com.hoo.common.internal.api;

import com.hoo.common.internal.api.dto.UploadFileResult;
import com.hoo.common.internal.api.dto.UploadFileCommand;

public interface UploadFileAPI {
    UploadFileCommand uploadFile(UploadFileResult request);
}
