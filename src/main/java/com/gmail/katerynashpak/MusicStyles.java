package com.gmail.katerynashpak;

public class MusicStyles {
    public void playMusic() {
    }

    static class PopMusic extends MusicStyles {
        @Override
        public void playMusic(){
            System.out.println("Playing pop music");
        }
    }
}