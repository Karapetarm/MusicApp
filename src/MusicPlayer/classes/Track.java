package MusicPlayer.classes;

import MusicPlayer.Interfaces.TrackI;


public class Track implements TrackI {

    String trackName;
    String trackArtist;
    double trackLength;
    String trackSound;

    public Track(String trackName, String trackArtist, double trackLength, String trackSound) {
        this.trackName = trackName;
        this.trackArtist = trackArtist;
        this.trackLength = trackLength;
        this.trackSound = trackSound;
    }

    @Override
    public String getSound() {
        return trackSound;
    }
}