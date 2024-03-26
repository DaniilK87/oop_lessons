package ru.geekbrains.oop.lesson6;

import ru.geekbrains.oop.lesson6.entity.Client;
import ru.geekbrains.oop.lesson6.entity.Order;
import ru.geekbrains.oop.lesson6.entity.Product;
import ru.geekbrains.oop.lesson6.service.OrderServiceImpl;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        Product product = new Product();
        Client client = new Client();
        Order order = new Order(client,product);
        OrderServiceImpl orderService = new OrderServiceImpl(order);
        orderService.inputFromConsole();
        orderService.saveToJson();
    }

}
