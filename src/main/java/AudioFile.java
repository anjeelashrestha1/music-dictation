import java.util.Date;
public class AudioFile {

    private String fileName;
    private String fileType;
    private double duration;
    private String filePath;
    private Date uploadDate;

    public AudioFile(String fileName, String fileType, double duration) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.duration = duration;
    }

    public void upload() {
        if (!validateFormat()) {
            throw new IllegalArgumentException("Invalid audio format");
        }

        if (!validateDuration()) {
            throw new IllegalArgumentException("Audio duration exceeds 10 minutes");
        }

        uploadDate = new Date();
    }

    public boolean validateFormat() {
        return fileType != null &&
               (fileType.equalsIgnoreCase("mp3")
                || fileType.equalsIgnoreCase("wav"));
    }

    public boolean validateDuration() {
        return duration <= 10.0 && duration >= 0;
    }

    public void delete() {
        filePath = null;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public double getDuration() {
        return duration;
    }
}