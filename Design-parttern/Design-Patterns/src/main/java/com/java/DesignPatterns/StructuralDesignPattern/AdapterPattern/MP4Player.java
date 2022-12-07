package com.java.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //not use here
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file.name: " + fileName);
    }
}
