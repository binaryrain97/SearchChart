package com.example.SearchChart.service;

import com.example.SearchChart.model.dto.SearchDto;
import com.example.SearchChart.model.entity.Search;
import com.example.SearchChart.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final SearchRepository searchRepository;

    public SearchDto saveSearch(SearchDto dto) {
        return searchRepository.save(new Search(null, dto.getContent(), LocalDateTime.now())).toDto();
    }

    public List<SearchDto> getSearchList() {
        List<Search> list = this.searchRepository.findAll();
        return list.stream().map(Search::toDto).toList();
    }
}
