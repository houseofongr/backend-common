package com.hoo.common.internal.api;

import java.net.URI;
import java.util.UUID;

public record UploadFileResult(
        UUID id,
        URI url
) {
}
