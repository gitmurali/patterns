package com.patterns.structural.adapter;

public class Main {
  public static void main(String[] args) {
    MediaPlayer mp3 = new MP3();
    mp3.play("melody.mp3");

    MediaPlayer vlc = new FormatAdapter(new VLC());
    vlc.play("somefile.avi");

    MediaPlayer mp4 = new FormatAdapter(new MP4());
    mp4.play("somefile.mp4");
  }
}
