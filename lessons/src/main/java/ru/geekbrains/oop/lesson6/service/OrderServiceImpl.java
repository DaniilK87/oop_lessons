package ru.geekbrains.oop.lesson6.service;


import ru.geekbrains.oop.lesson6.entity.Order;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderServiceImpl implements OrderService{

    private Order order;

    public OrderServiceImpl(Order order) {
       this.order = new Order(order.getClient(), order.getProduct());
    }

    @Override
    public void inputFromConsole() {
        order.getClient().setClientName(prompt("Имя клиента: "));
        order.getProduct().setType(prompt("Продукт: "));
        order.getProduct().setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.getProduct().setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    @Override
    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClient().getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct().getType() + "\",\n");
            writer.write("\"qnt\":"+ order.getProduct().getQnt()+",\n");
            writer.write("\"price\":"+order.getProduct().getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
