
    import java.util.ArrayList;


    public class Playlist {
        private String mName;
        private ArrayList<Song> mSongs;

        public Playlist(String playlistName) {
            mName = playlistName;
            mSongs = new ArrayList<Song>();
        }

        public String getName() {
            return mName;
        }

        public void addSong(Song song) {
            mSongs.add(song);
        }

        public void playAll() {
            // simplest approach is to use a for-each loop
            for (Song song : mSongs) {
                song.play();
            }
        }
}
