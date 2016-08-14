package MusicPlayer.Interfaces;


import MusicPlayer.classes.Track;

import java.util.List;

public interface PlayListI  {



     void addTrackToPL(Track ob);

     void removeTrackFromPL(int trackNumber);
}
