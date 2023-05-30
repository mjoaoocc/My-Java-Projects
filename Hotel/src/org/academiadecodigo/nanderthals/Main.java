package org.academiadecodigo.nanderthals;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Room room1 = hotel.rooms[0];
        Room room2 = hotel.rooms[1];
        Room room3 = hotel.rooms[2];
        Room room4 = hotel.rooms[3];

        Guest guest1 = new Guest("MJ");
        Guest guest2 = new Guest("Diogo");
        Guest guest3 = new Guest("Emilio");
        Guest guest4 = new Guest("Julia");

        hotel.checkIn(guest1, room1);
        hotel.checkIn(guest2, room2);
        hotel.checkIn(guest3, room3);
        hotel.checkIn(guest4, room4);
        hotel.checkIn(new Guest("Maria Joao"), room1);

        hotel.checkOut(room2);
        hotel.checkOut(room3);
        hotel.checkOut(room4);
        hotel.checkOut(room1);

    }
}

