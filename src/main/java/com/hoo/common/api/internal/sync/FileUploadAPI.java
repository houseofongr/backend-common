package com.hoo.common.api.internal.sync;

import com.hoo.common.api.dto.UploadFileRequest;
import com.hoo.common.api.dto.UploadFileResponse;

public interface FileUploadAPI {
    UploadFileResponse uploadFile(UploadFileRequest request);
}
