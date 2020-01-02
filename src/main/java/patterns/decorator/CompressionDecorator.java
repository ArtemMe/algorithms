package patterns.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public byte[] readData() {
        System.out.println("uncompress data");
        return super.readData();
    }

    @Override
    public void writeData(byte[] input) {
        System.out.println("compress data");
        super.writeData(input);
    }
}
