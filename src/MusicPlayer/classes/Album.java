package MusicPlayer.classes;

import MusicPlayer.Interfaces.TrackI;

import java.util.ArrayList;
import java.util.List;
import  MusicPlayer.Interfaces.*;

public class Album implements Album {

    String albumName;
    int albumLength;

  Public Album(String name){
      List<Track> al=new ArrayList<Track>();
      albumName=name;
  }

    @Override
    public void addToAlbum(TrackI track) {
        al.add(ob);
        albumLength++;

    }

    @Override
    public void removeFromAlbum(int trackNumber) {
        if(trackNumber<al.size()) {
            al.remove(trackNumber - 1);
            albumNametLength--;
        }
        else System.out.println("NO Track Found");

    }
}
