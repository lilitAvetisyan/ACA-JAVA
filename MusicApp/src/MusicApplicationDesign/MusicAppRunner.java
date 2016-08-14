package MusicApplicationDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lill on 8/14/16.
 */
public class MusicAppRunner extends MusicApplication {

    public static void main (String args[])
    {

        MusicApplication app = new MusicAppRunner();
        Song song1 = new Song();
        Artist artist1 = new Artist();
        artist1.setArtistName("The Doors");
        Song song2 = new Song("People are strange", artist1, 2, "excellent");
        Artist artist2 = new Artist();
        artist2.setArtistName("Poets Of the fall");
        Song song3 = new Song("Sleep",artist2, 4, "great");

        app.addSong(song1);
        app.addSong(song2);
        app.addSong(song3);

        List<Song> playlist = new ArrayList<>();
        List<Song> album = new ArrayList<>();

        playlist.add(song1);

        album.add(song1);
        album.add(song2);

        app.createNewPlaylist(playlist);
        app.importAlbum(album, "The doors");

    }
}
