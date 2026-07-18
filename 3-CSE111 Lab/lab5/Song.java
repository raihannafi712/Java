package lab5;

public class Song {
    String songName;
    String songArtist;
    int songLength;
    Song next;

    public Song(String name , String artist , int length){
        this.songName = name;
        this.songArtist = artist;
        this.songLength = length;
        this.next = null;
    }

    public void songInfo(){
        System.out.println("Title: " + this.songName + ", Artist: " + this.songArtist);
        System.out.println("Length: " + this.songLength + " minutes");
    }
}
