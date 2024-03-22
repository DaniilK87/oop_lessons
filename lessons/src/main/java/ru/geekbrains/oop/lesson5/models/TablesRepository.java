package ru.geekbrains.oop.lesson5.models;

import ru.geekbrains.oop.lesson5.presenters.Model;

import java.util.*;

public class TablesRepository implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }


    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table: tables) {
            if (oldReservation == reserve() & table.getNo() == tableNo) {
                Reservation newReserve = new Reservation(table, reservationDate, name);
                table.getReservations().add(newReserve);
                return newReserve.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }


    private int reserve() {
        int reserve = 0;
        for (Table t: tables) {
            Iterator<Reservation> res = t.getReservations().iterator();
            while (res.hasNext()) {
               reserve = res.next().getId();
            }
        }
        return reserve;
    }
}

