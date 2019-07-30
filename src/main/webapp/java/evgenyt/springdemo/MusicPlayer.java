package evgenyt.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Any ONE of this Autowired is enough to wire music to player
 */

@Component
public class MusicPlayer {
    @Autowired
    // This method is not recommended
    private Music music;

    @Autowired
    // If there is only one constructor Autowired can be skipped
    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public void anyNameHere(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing:" + music.getSong());
    }
}
