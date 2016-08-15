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

        Artist artist3 = new Artist();
        artist3.setArtistName("Poets Of the fall");
        Song song3 = new Song("Sleep",artist3, 4, "great");


        AlbumContainer album = new AlbumContainer();
        PlaylistContainer playlist = new PlaylistContainer();

        app.openApplication();

        app.addSong(song1);
        app.addSong(song2);
        app.addSong(song3);

        playlist.addSongToPlaylist(song1, playlist.playlistSongs);

        album.albumSongs.add(song1);
        album.albumSongs.add(song2);

        album.importAlbum(album.albumSongs, "The doors");

        app.closeApplication();

        System.out.println(app.songsNumber);

    }
}
