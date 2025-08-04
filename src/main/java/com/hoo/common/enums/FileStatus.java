package com.hoo.common.enums;

public enum FileStatus {
    PENDING,    // 업로드 대기
    CREATED,    // 업로드 및 메타데이터 등록 완료
    PROCESSING, // 후처리 중
    UPDATED,    // 내용 변경됨
    DELETED,    // 삭제됨
    RESTORED,   // 삭제 후 복구됨
    ARCHIVED,   // 장기보관 상태
    FAILED,     // 실패
    EXPIRED,    // 만료됨
    LOCKED      // 잠금 (읽기 전용)
}
