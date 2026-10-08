import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MusicProcessingMockTest {

    @Test
    void mockAudioFileCanBeValidated() {

        AudioFile audioFile = mock(AudioFile.class);

        when(audioFile.validateFormat()).thenReturn(true);
        when(audioFile.validateDuration()).thenReturn(true);

        assertTrue(audioFile.validateFormat());
        assertTrue(audioFile.validateDuration());

        verify(audioFile).validateFormat();
        verify(audioFile).validateDuration();
    }
}