public class MusicResult {

    private int resultId;
    private String notes;
    private String instruments;
    private double tempo;
    private String key;

    public MusicResult(String notes, String instruments, double tempo, String key) {
        this.notes = notes;
        this.instruments = instruments;
        this.tempo = tempo;
        this.key = key;
    }

    public void displayNotes() {
        System.out.println(notes);
    }

    public void displayInstruments() {
        System.out.println(instruments);
    }

    public void displayResults() {
        System.out.println("Notes: " + notes);
        System.out.println("Instruments: " + instruments);
        System.out.println("Tempo: " + tempo);
        System.out.println("Key: " + key);
    }

    public String getNotes() {
        return notes;
    }

    public String getInstruments() {
        return instruments;
    }

    public double getTempo() {
        return tempo;
    }

    public String getKey() {
        return key;
    }
}