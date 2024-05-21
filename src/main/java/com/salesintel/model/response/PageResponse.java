package com.salesintel.model.response;

import java.util.List;
import java.util.function.Function;

public class PageResponse<R> {
    private final List<R> content;

    private final int page;

    private final int size;

    private final long totalPages;

    private final long totalElements;

    public PageResponse(
            List<R> content, int page, int size, long totalPages, long totalElements
    ) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }

    public <E> PageResponse(
            List<E> content, Function<E, R> converter, int page, int size, long totalPages, long totalElements
    ) {
        this.content = content.stream().map(converter).toList();
        this.page = page;
        this.size = size;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }


    public List<R> getContent() {
        return content;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }
}
