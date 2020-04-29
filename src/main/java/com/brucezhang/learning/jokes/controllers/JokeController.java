package com.brucezhang.learning.jokes.controllers;

import com.brucezhang.learning.jokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokeController {

  private JokeService _jokeService;

  @Autowired
  public JokeController(JokeService jokeService) {
    _jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {
    model.addAttribute("joke", _jokeService.getJoke());

    return "chucknorris";
  }
}
