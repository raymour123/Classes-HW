
    public class Song {
        private String mSongName, mArtistName, mAlbumName;

        public Song(String songName, String artistName, String albumName) {
            mSongName = songName;
            mArtistName = artistName;
            mAlbumName = albumName;
        }

        public void play() {
            System.out.println("now playing: " + mSongName + " by " + mArtistName + " from " + mAlbumName);
        }
}
