package com.hoo.common.enums;

import java.util.Map;
import java.util.Set;

public enum MediaType {

    IMAGES,
    AUDIOS,
    DOCUMENTS,
    VIDEOS;

    public static MediaType of(String contentType) {

        if (contentType == null || contentType.isBlank() || !contentType.contains("/")) {
            throw new IllegalArgumentException("잘못된 MIME Type 형식입니다.");
        }

        if (MimeTypeCategoryRegistry.getMimeTypeSet(IMAGES).contains(contentType)) return MediaType.IMAGES;
        if (MimeTypeCategoryRegistry.getMimeTypeSet(AUDIOS).contains(contentType)) return MediaType.AUDIOS;
        if (MimeTypeCategoryRegistry.getMimeTypeSet(VIDEOS).contains(contentType)) return MediaType.VIDEOS;
        if (MimeTypeCategoryRegistry.getMimeTypeSet(DOCUMENTS).contains(contentType)) return MediaType.DOCUMENTS;

        throw new UnsupportedOperationException("지원하지 않는 MIME Type 형식입니다.");
    }

    public static class MimeTypeCategoryRegistry {

        public static final Map<MediaType, Set<String>> mimeTypeMap = Map.of(
                IMAGES, Set.of(
                        "image/jpeg", "image/png", "image/gif", "image/webp", "image/bmp",
                        "image/tiff", "image/svg+xml", "image/x-icon", "image/heic", "image/heif"
                ),
                AUDIOS, Set.of(
                        "audio/mpeg", "audio/mp3", "audio/wav", "audio/ogg", "audio/webm",
                        "audio/aac", "audio/flac", "audio/x-ms-wma", "audio/x-wav", "audio/amr"
                ),
                VIDEOS, Set.of(
                        "video/mp4", "video/mpeg", "video/quicktime", "video/x-msvideo", "video/x-ms-wmv",
                        "video/webm", "video/ogg", "video/3gpp", "video/3gpp2", "video/x-matroska"
                ),
                DOCUMENTS, Set.of(
                        "application/pdf", "application/msword", "application/vnd.ms-excel", "application/vnd.ms-powerpoint",
                        "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                        "application/vnd.openxmlformats-officedocument.presentationml.presentation",
                        "application/vnd.oasis.opendocument.text", "application/vnd.oasis.opendocument.spreadsheet",
                        "application/vnd.oasis.opendocument.presentation", "text/plain", "text/csv",
                        "text/rtf", "application/rtf", "application/x-hwp", "application/x-hwpml",
                        "application/x-hwpdoc", "application/vnd.hancom.hwp", "application/vnd.hancom.hwpml"
                )
        );

        public static Set<String> getMimeTypeSet(MediaType mediaType) {
            return mimeTypeMap.get(mediaType);
        }

    }
}
