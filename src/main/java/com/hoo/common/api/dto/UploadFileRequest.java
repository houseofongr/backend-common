package com.hoo.common.api.dto;

import java.io.InputStream;

public record UploadFileRequest(
        String name,
        Long size,
        InputStream inputStream
) {

}
