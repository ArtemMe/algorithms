package patterns.decorator;

public class DataSourceDecorator implements DataSource {

    DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public byte[] readData() {
        return dataSource.readData();
    }

    @Override
    public void writeData(byte[] input) {
        dataSource.writeData(input);
    }
}
