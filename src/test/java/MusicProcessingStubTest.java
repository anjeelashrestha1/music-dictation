import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicProcessingStubTest {

    static class AudioFileStub extends AudioFile {

        public AudioFileStub() {
            super("stub-song.mp3", "mp3", 5.0);
        }

        @Override
        public boolean validateFormat() {
            return true;
        }

        @Override
        public boolean validateDuration() {
            return true;
        }
    }

    @Test
    void stubAudioFileShouldBeValid() {

        AudioFileStub stub = new AudioFileStub();

        assertTrue(stub.validateFormat());
        assertTrue(stub.validateDuration());
    }
}