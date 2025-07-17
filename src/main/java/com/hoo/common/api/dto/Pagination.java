package com.hoo.common.api.dto;

public record Pagination(
        int page,
        int size,
        int totalPages,
        long totalElements
) {

}
