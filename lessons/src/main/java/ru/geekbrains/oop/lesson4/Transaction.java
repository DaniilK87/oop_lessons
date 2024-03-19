package ru.geekbrains.oop.lesson4;


public class Transaction<T extends Box<?>> {

    private T from;
    private T to;


    public Transaction(T from, T to) {
        this.from = from;
        this.to = to;
    }

    public Transaction() {}

    public void empty(int count) {
        if (from.getFruits().size() >= count) {
            System.out.println("Выполнено перемещение\n" + " " + count);
            System.out.printf("Из коробки 1: #%s штуки;\nВ коробку 2: #%s штуки;",
                    from.getFruits().size(), to.getFruits().size());


            for (int i = 0; i < count; i++) {
                from.getFruits().remove(i);
                to.getFruits().add(from.getFruits().get(i)); //incompatible types: ru.geekbrains.oop.lesson4.Fruit cannot be converted to capture#1 of ?
            }

            System.out.println();
            System.out.println("\tТеперь в коробке 1: " + to.getFruits().size() + "\tштуки");
            System.out.println("\tТеперь в коробке 2: " + from.getFruits().size() + "\tштуки");
        } else {
            System.out.println("Перемещение отменено");
        }
    }

    public void empty(T from, T to) {
        to.getFruits().addAll(from.getFruits()); //incompatible types: java.util.ArrayList<capture#3 of ?> cannot be converted to java.util.Collection<? extends capture#4 of ?>
        from.getFruits().clear();
        System.out.println(to.getFruits().size());
        System.out.println(from.getFruits().size());
    }
}
