package com.java.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class MediaAdapert implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapert(String audiotype){
        if (audiotype.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer = new VLCPlayer();
        }else if (audiotype.equalsIgnoreCase("MP4")){
            advanceMediaPlayer = new MP4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advanceMediaPlayer.playVLC(fileName);
        }else if (audioType.equalsIgnoreCase("MP4")){
            advanceMediaPlayer.playMP4(fileName);
        }
    }
}
