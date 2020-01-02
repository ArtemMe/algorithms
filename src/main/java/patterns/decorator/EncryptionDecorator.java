package patterns.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public byte[] readData() {
        System.out.println("decrypt data");
        return super.readData();
    }

    @Override
    public void writeData(byte[] input) {
        System.out.println("encrypt data");
        super.writeData(input);
    }
}
