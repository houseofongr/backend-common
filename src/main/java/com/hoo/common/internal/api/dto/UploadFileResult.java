package com.hoo.common.internal.api.dto;

import java.io.InputStream;

public record UploadFileResult(
        String name,
        Long size,
        InputStream inputStream
) {

}
