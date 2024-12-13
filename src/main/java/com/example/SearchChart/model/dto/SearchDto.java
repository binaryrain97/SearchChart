package com.example.SearchChart.model.dto;

import com.example.SearchChart.model.entity.Search;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchDto {
    private Long id;
    private String content;
    private LocalDateTime localDateTime;

    public Search toEntity() {
        return new Search(id, content, localDateTime);
    }
}
