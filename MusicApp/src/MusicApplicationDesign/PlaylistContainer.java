package MusicApplicationDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lill on 8/15/16.
 */
public  class PlaylistContainer implements Playlist{

    List<Song> playlistSongs = new ArrayList<>();
    int playlistSongsNumber;

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

    @Override
    public int numberOfSongs() {
        return playlistSongsNumber;
    }

    @Override
    public List<Song> songs() {
        return playlistSongs;
    }
}
