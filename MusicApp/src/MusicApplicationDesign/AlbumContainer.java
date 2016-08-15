package MusicApplicationDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lill on 8/15/16.
 */
public  class AlbumContainer implements Album

{
    List<Song> albumSongs = new ArrayList<>();
    Artist artist = new Artist();
    String albumName;
    int albumsNum;


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }


    @Override
    public String artist() {
        return artist.getArtistName();
    }

    @Override
    public String albumName() {
        return getAlbumName();
    }

    @Override
    public List<Song> albumSongs() {
        return albumSongs;
    }

    void importAlbum(List<Song> theNewAlbum, String artistName)
    {
        List<Song> newAlbum = new ArrayList<>();

        for (Song s : theNewAlbum)
        {
            newAlbum.add(s);
        }

        artist.setArtistName(artistName);
        albumsNum++;
        System.out.println("new Album is created");
        System.out.println();

    }
}
