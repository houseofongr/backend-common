package com.hoo.common.internal.api.file.dto;

import java.io.InputStream;

public record FileCommand(
        InputStream inputStream,
        Long size,
        String name,
        String contentType
) {
}
