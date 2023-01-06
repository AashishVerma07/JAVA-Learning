package com.java.DesignPatterns.StructuralDesignPattern.AdapterPattern;

public class AdapterPatterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "volume1.MP3");
        audioPlayer.play("MP4", "ALONE.MP4");
        audioPlayer.play("VLC", "BABE.VLC");
        audioPlayer.play("AVI", "Fuimati.AVI");

    }
}
