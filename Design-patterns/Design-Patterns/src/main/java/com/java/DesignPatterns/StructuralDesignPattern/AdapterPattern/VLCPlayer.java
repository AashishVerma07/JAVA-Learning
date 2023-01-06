package com.java.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class VLCPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("playing VLC file.name: "+ fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //not use here
    }
}
