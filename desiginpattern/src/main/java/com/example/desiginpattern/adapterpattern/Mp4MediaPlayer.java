package com.example.desiginpattern.adapterpattern;

public class Mp4MediaPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playMp4() {
        System.out.print("播放Mp4格式");
    }

    @Override
    public void playVlc() {

    }
}
