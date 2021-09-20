package com.canattofilipe.jasperreportssamples.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports/")
@Slf4j
public class ReportsController {

  @PostMapping
  public ResponseEntity<String> buildReport() {

    log.info("Test");
    return ResponseEntity.ok().build();
  }
}
