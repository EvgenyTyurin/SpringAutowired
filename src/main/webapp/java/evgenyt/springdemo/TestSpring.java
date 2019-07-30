package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Autowired annotation demo
 */

public class TestSpring {
    public static void main(String[] args) {
        // In xml file component-scan tag filled with package to search bean classes
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // Component RockMusic autowired to Component MusicPlayer
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
