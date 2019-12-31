package patterns.decorator;

public class FileDataSource implements DataSource {
    @Override
    public byte[] readData() {
        return "data".getBytes();
    }

    @Override
    public void writeData(byte[] input) {
        System.out.println("writing data");
    }
}
