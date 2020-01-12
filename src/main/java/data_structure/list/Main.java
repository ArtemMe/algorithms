package data_structure.list;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("five");

        list.add(2, "asdfasdf");

        list.show();
    }
}
