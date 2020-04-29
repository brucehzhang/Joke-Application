package com.brucezhang.learning.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes _chuckNorrisQuotes;

  public JokeServiceImpl() {
    _chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return _chuckNorrisQuotes.getRandomQuote();
  }
}
