package com.example.todolist.controller;

import java.util.LinkedList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(path = {"/tasks"})
@RequiredArgsConstructor
@Validated
public class TodolistController {

  @ResponseBody
  @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<String>> getTasks() {
    List<String> allTasks = new LinkedList<>();
    allTasks.add("Task 1");
    allTasks.add("Task 2");
    return ResponseEntity.ok(allTasks) ;
  }
}
