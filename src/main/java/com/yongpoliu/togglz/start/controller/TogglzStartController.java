package com.yongpoliu.togglz.start.controller;

import com.yongpoliu.togglz.start.feature.MyTogglzFeature;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/togglz-start")
public class TogglzStartController {

  @RequestMapping("/show")
  public String showToggle() {
    return MyTogglzFeature.FEATURE_ONE.isActive() ? "toggle feature one is active."
                                                  : "toggle feature one is unactive.";
  }
}
