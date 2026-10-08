import java.util.Date;
public class MusicProcessing {

    private int processingId;
    private String status;
    private Date startTime;
    private Date endTime;

    public void processAudio() {
        status = "Processing";
        startTime = new Date();
    }

    public void detectNotes() {
        status = "Notes detected";
    }

    public void detectInstruments() {
        status = "Instruments detected";
    }

    public MusicResult generateMusicResult() {
        status = "Completed";
        endTime = new Date();

        return new MusicResult(
            "C D E F G",
            "Piano",
            120.0,
            "C Major"
        );
    }

    public String getStatus() {
        return status;
    }
}