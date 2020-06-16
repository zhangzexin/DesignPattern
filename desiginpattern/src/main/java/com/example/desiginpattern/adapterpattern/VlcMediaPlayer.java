package com.example.desiginpattern.adapterpattern;

public class VlcMediaPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playMp4() {

    }

    @Override
    public void playVlc() {
        System.out.print("播放VLC格式");
    }
}
