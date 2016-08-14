package MusicApplicationDesign;

/**
 * Created by Lill on 8/14/16.
 */
public class Song  implements Playable {
    private String songName;
    private int length;
    private String rating;

    Artist singer;
    protected boolean isPlaying;


    public Song()
    {
        this.songName = "Alabama song";

    }
    public Song(String songName, Artist singer, int length, String rating)
    {
        this.songName = songName;
        this.singer = singer;
        this.length = length;
        this.rating = rating;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Playing...");

    }

    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("Paused...");

    }

    public String getSongName() {
        return songName;
    }
}
