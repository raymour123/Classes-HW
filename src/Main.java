
    public class Main {
        public static void main(String[] args) {

            User user = new User("Raymour");

            Song song1 = new Song("adams song", "Blink 182", "Enema of the State");
            Song song2 = new Song("whats my age again", "Blink 182", "Enema of the State");
            Song song3 = new Song("all the small things", "Blink 182", "Enema of the State");
            Song song4 = new Song("Aliens Exist", "Blink 182", "Enema of the State");
            Song song5 = new Song("I miss you", "Blink 182", "Greatest Hits");

            // create playlist 1, populate it with songs, and add it to user
            Playlist summer16 = new Playlist("summer16");
            summer16.addSong(song1);
            summer16.addSong(song2);
            summer16.addSong(song4);
            user.addPlaylist(summer16);

            // create playlist 2, populate it with songs, and add it to user
            Playlist fall16 = new Playlist("fall16");
            fall16.addSong(song5);
            fall16.addSong(song1);
            fall16.addSong(song3);
            user.addPlaylist(fall16);

            // print the names of all the user's playlists
            System.out.println("playlists: " + user.getAllPlaylistNames());

            // "play" all the songs in each of the user's playlists
            for (String playlistName : user.getAllPlaylistNames()) {
                System.out.println("playing: " + playlistName);

                // getPlaylistByName() returns a Playlist; call the playAll() method on that Playlist
                user.getPlaylistByName(playlistName).playAll();
            }
        }
    }

