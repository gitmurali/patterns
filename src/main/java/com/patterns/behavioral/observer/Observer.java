package com.patterns.behavioral.observer;

public interface Observer {
  void update();

  void setSubject(Subject sub);
}
