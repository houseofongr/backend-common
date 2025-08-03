package com.hoo.common.internal.api;

import java.io.InputStream;

public record FileSource(
        InputStream inputStream,
        String contentType,
        String name,
        Long size,
        String domain
) {
}
