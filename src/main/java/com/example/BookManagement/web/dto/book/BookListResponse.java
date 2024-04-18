package com.example.BookManagement.web.dto.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookListResponse implements Serializable {
    private List<BookResponse> userResponses = new ArrayList<>();
}
