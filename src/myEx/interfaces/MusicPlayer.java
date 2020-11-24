package myEx.interfaces;

public class MusicPlayer {

    public interface Device{
        void turnOn();
        void turnOff();
    }

    static class Mp3Player implements Device{

        @Override
        public void turnOn() {
            System.out.println("MP3 is on");
        }

        @Override
        public void turnOff() {
            System.out.println("MP3 is off");
        }
    }

    static class Mp4Player extends Mp3Player{

        @Override
        public void turnOn() {
            System.out.println("MP4 is on");
        }

        @Override
        public void turnOff() {
            System.out.println("MP4 is off");
        }
    }

    public static void main(String[] args) {
        Device mp3Player = new Mp3Player();
        mp3Player.turnOn();
        mp3Player.turnOff();
        System.out.println("--------------------------");
        Device mp4Player = new Mp4Player();
        mp4Player.turnOn();
        mp4Player.turnOff();
    }
}
