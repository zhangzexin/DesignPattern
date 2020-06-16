package com.example.desiginpattern.adapterpattern;

public class MediaPlayer implements IMediaPlayer {
    @Override
    public void play(String fileName) {
        if ("mp4".equalsIgnoreCase(fileName)) {
            new Mp4MediaPlayer().playMp4();
        } else if ("vlc".equalsIgnoreCase(fileName)) {
            new VlcMediaPlayer().playVlc();
        }
    }
}
