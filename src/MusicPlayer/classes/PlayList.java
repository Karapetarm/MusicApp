package MusicPlayer.classes;

import MusicPlayer.Interfaces.PlayListI;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements PlayListI {

    String playListName;
    int playListLength;


   public PlayList(String playListName){
       List<Track> pl=new ArrayList<Track>();
       this.playListName=playListName;
   }


    @Override
    public void addTrackToPL(Track ob) {
        pl.add(ob);
        playListLength++;
    }

    @Override
    public void removeTrackFromPL(int trackNumber) {
        if(trackNumber<pl.size()) {
            pl.remove(trackNumber - 1);
            playListLength--;
        }
        else System.out.println("NO Track Found");

    }

}
