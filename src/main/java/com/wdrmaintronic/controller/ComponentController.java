package com.wdrmaintronic.controller;

import com.wdrmaintronic.dto.request.CreateComponentRequest;
import com.wdrmaintronic.service.ComponentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/components")
@RequiredArgsConstructor
public class ComponentController {

    private final ComponentService componentService;

    @PostMapping("register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid CreateComponentRequest request
    ) {
        componentService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
