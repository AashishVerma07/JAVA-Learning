package com.java.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    MediaAdapert mediaAdapert;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file.name: " + fileName);
        }
        //mediaAdapter is providing support to play other file format
        else if (audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")) {
            mediaAdapert = new MediaAdapert(audioType);
            mediaAdapert.play(audioType, fileName);
        } else {
            System.out.println("Invelid media. " + audioType + " Format NOT support ");
        }

    }
}
