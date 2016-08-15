package MusicApplicationDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lill on 8/14/16.
 */
public  class MusicApplication implements Openable {

    List<Song> allSongs = new ArrayList<>();
    boolean isRunning;
    int songsNumber;

    Song song = new Song();

    void addSong(Song song)
    {
        allSongs.add(song);
        songsNumber++;
        System.out.println("The song " + song.getSongName() + " is added");
        System.out.println();

    }

    @Override
    public void openApplication() {
        isRunning = true;
        System.out.println("Application is opened!!!");
        System.out.println();


    }

    @Override
    public void closeApplication() {
        isRunning = false;
        System.out.println("Closing the application");
        System.out.println();


    }
}
