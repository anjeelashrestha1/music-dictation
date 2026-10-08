import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AudioFileTest {

    @Test
    void validMp3FormatShouldBeAccepted() {
        AudioFile audio = new AudioFile("song.mp3", "mp3", 5.0);

        assertTrue(audio.validateFormat());
    }

    @Test
    void audioUnderTenMinutesShouldBeAccepted() {
        AudioFile audio = new AudioFile("song.wav", "wav", 8.0);

        assertTrue(audio.validateDuration());
    }

    @Test
    void audioOverTenMinutesShouldBeRejected() {
        AudioFile audio = new AudioFile("longsong.mp3", "mp3", 12.0);

        assertFalse(audio.validateDuration());
    }
}