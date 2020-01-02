package patterns.decorator;

public interface DataSource {
    byte[] readData();
    void writeData(byte[] input);
}
