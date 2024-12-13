package com.example.SearchChart.controller;

import com.example.SearchChart.model.dto.SearchDto;
import com.example.SearchChart.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping()
    public ResponseEntity<SearchDto> saveSearch(@RequestBody SearchDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(this.searchService.saveSearch(dto));
    }

    @GetMapping("/list")
    public ResponseEntity<List<SearchDto>> getSearchList() {
        return ResponseEntity.status(HttpStatus.OK).body(this.searchService.getSearchList());
    }
}
