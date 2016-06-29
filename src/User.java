
    import java.util.HashMap;
    import java.util.Set;

    public class User {
        private String mName;
        private HashMap<String, Playlist> mPlaylists;

        public User(String userName) {
            mName = userName;
            mPlaylists = new HashMap<String, Playlist>();
        }

        public void addPlaylist(Playlist playlist) {
            // Use the playlist's name as the key for the HashMap
            mPlaylists.put(playlist.getName(), playlist);
        }

        public Set<String> getAllPlaylistNames() {
            // return the keys from the HashMap
            return mPlaylists.keySet();
        }

        public Playlist getPlaylistByName(String name) {
            // note: get() returns null if the HashMap doesn't have an entry with that key
            return mPlaylists.get(name);
        }
}
