package lab5;

public class Playlist {
    String name;
    Song start;


    public Playlist(String name){

        this.name = name;
        this.start = null;
        System.out.println(this.name + " created.");
    }

    public void info(){

        System.out.println("First Playlist has the following songs: ");
        if (start == null) {

            System.out.println("No songs in " + name + ".");
        } else {
            
            Song currentSong = start;
            int playlistSongCount = 1;
            while (currentSong != null) {
                
                System.out.println("Song- " + playlistSongCount);
                currentSong.songInfo();
                currentSong = currentSong.next;
                playlistSongCount ++;

            }
        }
    }

    public void addSong(Song addedNewSong) {

        if (start == null) {

            start = addedNewSong;
        } else {

            Song currentSong = start;
            while (currentSong.next != null) {

                currentSong = currentSong.next;
            }
            currentSong.next = addedNewSong;
        }
        
        System.out.println(addedNewSong.songName + " added to " + name + ".");
    }

    public void addSong(Song addedNewSong, int songIndex) {

        if (songIndex == 0) {

            addedNewSong.next = start;
            start = addedNewSong;
            System.out.println(addedNewSong.songName + " added to " + name + ".");
            return;
        }
    
        Song currentSong = start;
        int currentIndex = 0;
    
        while (currentSong != null && currentIndex < songIndex - 1) {

            currentSong = currentSong.next;
            currentIndex++;
        }
    
        if (currentSong == null) {

            System.out.println("Cannot add song to Index " + songIndex + ".");
        } else {
            
            addedNewSong.next = currentSong.next;
            currentSong.next = addedNewSong;

            System.out.println(addedNewSong.songName + " added to " + name + ".");
        }
    }

    public void playSong(String songName) {

        Song currentSong = start;
        while (currentSong != null) {

            if (currentSong.songName.equals(songName)) {

                System.out.println("Playing " + currentSong.songName + " by " + currentSong.songArtist + ".");
                return;
            }
            currentSong = currentSong.next;
        }
        System.out.println(songName + " not found in " + name + ".");
    }

    public void playSong(int songIndex) {

        Song currentSong = start;
        int currentIndex = 0;
    
        while (currentSong != null) {

            if (currentIndex == songIndex) {

                System.out.println("Playing " + currentSong.songName + " by " + currentSong.songArtist + ".");
                return;
            }
            currentSong = currentSong.next;
            currentIndex++;
        }
    
        System.out.println("Song at Index " + songIndex + " not found in " + name + ".");
    }

    public void deleteSong(String songName) {
        
        if (start == null) {

            System.out.println(songName + " not found in " + name + ".");
            return;
        }

        if (start.songName.equals(songName)) {

            start = start.next;
            System.out.println(songName + " deleted from " + name + ".");
            return;
        }
    
        Song currentSong = start;

        while (currentSong.next != null) {

            if (currentSong.next.songName.equals(songName)) {

                currentSong.next = currentSong.next.next;
                System.out.println(songName + " deleted from " + name + ".");
                return;
            }
            currentSong = currentSong.next;
        }
    
        System.out.println(songName + " not found in " + name + ".");
    }

    public int totalSong() {

        int count = 0;
        Song currentSong = start;
        while (currentSong != null) {

            count++;
            currentSong = currentSong.next;
        }
        return count;
    }

    public void merge(Playlist secondaryNumPlaylist) {

        if (secondaryNumPlaylist == null || secondaryNumPlaylist.start == null) {

            return;
        }
    
        if (this.start == null) {

            this.start = secondaryNumPlaylist.start;
        } else {

            Song currentSong = this.start;
            while (currentSong.next != null) {

                currentSong = currentSong.next;
            }
            currentSong.next = secondaryNumPlaylist.start;
        }
    
        System.out.println("Merge Completed!");
    }


    
}
