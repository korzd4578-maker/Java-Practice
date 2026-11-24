package Practice12;
import java.util.*;
public class Task26 {
    static final class Song {

        private final String title;
        private final String artist;
        private final int durationSec;

        public Song(String title, String artist, int durationSec) {
            this.title = title;
            this.artist = artist;
            this.durationSec = durationSec;
        }

        public int getDurationSec() {
            return durationSec;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof Song other)) {
                return false;
            }

            return Objects.equals(title, other.title)
                    && Objects.equals(artist, other.artist);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, artist);
        }

        @Override
        public String toString() {
            return title + " - " + artist;
        }
    }

    static class Playlist implements Iterable<Song> {

        private final Set<Song> tracks = new LinkedHashSet<>();

        public void addSong(Song song) {
            tracks.add(song);
        }

        public Set<Song> getTracksCopy() {
            return new LinkedHashSet<>(tracks);
        }

        @Override
        public Iterator<Song> iterator() {

            return Collections.unmodifiableSet(tracks).iterator();
        }

        public int getTotalDuration() {

            int total = 0;

            for (Song song : this) {
                total += song.getDurationSec();
            }

            return total;
        }
    }

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addSong(new Song("Starboy", "The Weeknd", 230));
        playlist.addSong(new Song("Believer", "Imagine Dragons", 204));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", 200));

        System.out.println("Плейлист:");

        for (Song song : playlist) {
            System.out.println(song);
        }

        System.out.println("Копия коллекции: "
                + playlist.getTracksCopy());

        System.out.println("Общая продолжительность: "
                + playlist.getTotalDuration() + " секунд");
    }
}
