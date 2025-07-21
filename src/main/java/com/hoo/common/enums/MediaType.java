package com.hoo.common.enums;

public enum MediaType {

    IMAGE, AUDIO, DOCUMENT, VIDEO;

    public static MediaType of(String contentType) {

        if (contentType == null || contentType.isBlank() || !contentType.contains("/")) {
            throw new IllegalArgumentException("잘못된 MIME Type 형식입니다.");
        }

        if (contentType.startsWith("image/")) return MediaType.IMAGE;
        if (contentType.startsWith("video/")) return MediaType.VIDEO;
        if (contentType.startsWith("audio/")) return MediaType.AUDIO;
        if (contentType.startsWith("application/")) return MediaType.DOCUMENT;

        throw new UnsupportedOperationException("지원하지 않는 MIME Type 형식입니다.");
    }
}
