
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.io.File;


public class canPlayMusicTest {

    private String successPath;


    private AudioMessagePlayer audio;

    @Before
    public void setup() {
        successPath = "/Users/gokhandilek/Documents/javas/src/main/resources/1.mp3";
        audio = new AudioMessagePlayer();

    }

    @Test
    public void canGetFile () {
        File file = new File(successPath);
        Assert.assertTrue(file.exists());
    }

    @Test
    public void canPlayMp3File() {
        for(int i=0; i<2; i++) {
            audio.play(successPath);
        }

    }
    @Test
    public void canPlaySuccessFile() {
    audio.playSuccess();
     //   audio.play(successAudioFilePath);

    }



}
