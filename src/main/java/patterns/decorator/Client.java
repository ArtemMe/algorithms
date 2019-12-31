package patterns.decorator;
/***
 * Декораторы это обертки которые добавляют новую функционлальность.
 */

public class Client {
    public static void main(String[] args) {
        DataSource source = new FileDataSource();

        source = new EncryptionDecorator(new CompressionDecorator(source));

        source.writeData("data".getBytes());

        source.readData();
    }
}
