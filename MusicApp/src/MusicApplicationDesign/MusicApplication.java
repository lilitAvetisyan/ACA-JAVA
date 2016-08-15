package MusicApplicationDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lill on 8/14/16.
 */
public  class MusicApplication implements Openable {

    List<Song> allSongs = new ArrayList<>();

    int songsNumber;
    int playlistSongsNumber;
    int albumsNum;

    boolean isRunning;

    Artist artist = new Artist();
    Song song = new Song();

    void importAlbum(List<Song> theNewAlbum, String artistName)
    {
        List<Song> newAlbum = new ArrayList<>();

        for (Song s : theNewAlbum)
        {
            newAlbum.add(s);
        }

        artist.setArtistName(artistName);
        albumsNum++;
        songsNumber += newAlbum.size();
        System.out.println("new Album is created");
        System.out.println();

    }
    void addSongToPlaylist(Song song, List<Song> playlist)
    {

        playlist.add(song);
        playlistSongsNumber++;
        System.out.println("The song is added to the playlist");
        System.out.println();


    }
    void createNewPlaylist(List<Song> theNewPlaylist)
    {
        List<Song> newPlaylist = new ArrayList<>();
        for (Song s : theNewPlaylist)
        {
            newPlaylist.add(s);
        }
        System.out.println("New playlist is created");
        System.out.println();

    }
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
