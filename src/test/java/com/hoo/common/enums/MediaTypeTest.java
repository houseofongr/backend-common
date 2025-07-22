package com.hoo.common.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MediaTypeTest {

    @Test
    @DisplayName("유효한 MIME 타입을 통해 MediaType 반환")
    void of_validMimeTypes() {
        assertThat(MediaType.of("image/jpeg")).isEqualTo(MediaType.IMAGE);
        assertThat(MediaType.of("image/png")).isEqualTo(MediaType.IMAGE);
        assertThat(MediaType.of("video/mp4")).isEqualTo(MediaType.VIDEO);
        assertThat(MediaType.of("audio/mpeg")).isEqualTo(MediaType.AUDIO);
        assertThat(MediaType.of("application/pdf")).isEqualTo(MediaType.DOCUMENT);
        assertThat(MediaType.of("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
                .isEqualTo(MediaType.DOCUMENT);
    }

    @Test
    @DisplayName("contentType이 null, 공백, '/' 미포함이면 IllegalArgumentException 발생")
    void of_invalidFormat_shouldThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MediaType.of(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 MIME Type 형식");

        assertThatThrownBy(() -> MediaType.of(""))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> MediaType.of("plain-text"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("지원하지 않는 MIME 타입이면 UnsupportedOperationException 발생")
    void of_unsupportedType_shouldThrowUnsupportedOperationException() {
        assertThatThrownBy(() -> MediaType.of("text/plain"))
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessageContaining("지원하지 않는");
    }
}
