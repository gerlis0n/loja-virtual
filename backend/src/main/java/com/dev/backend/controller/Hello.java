package com.dev.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Hello {

  @GetMapping("/")
  public String hello() {

    return "Olá mundo " + new Date();

  }
}