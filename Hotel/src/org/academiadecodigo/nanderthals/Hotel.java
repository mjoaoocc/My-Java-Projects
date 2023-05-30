package org.academiadecodigo.nanderthals;

public class Hotel {
    public Room[] rooms;
    public Guest[] guests;

    public Hotel() {
        rooms = new Room[4];
        guests = new Guest[4];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
    }

    public void checkIn(Guest guest, Room room) {
        if (room.isAvailable()) {
            room.setAvailable(false);
            checkInToRoom(guest, room);
            System.out.println(guest.getName() + " has checked in to Room " + getRoomNumber(room));
        } else {
            System.out.println("Sorry, Room " + getRoomNumber(room) + " is not available.");
        }
    }

    public void checkOut(Room room) {
        if (!room.isAvailable()) {
            room.setAvailable(true);
            Guest guest = getGuestInRoom(room);
            if (guest != null) {
                checkOutFromRoom(room);
                System.out.println(guest.getName() + " has checked out from Room " + getRoomNumber(room));
            } else {
                System.out.println("No guest checked into Room " + getRoomNumber(room));
            }
        } else {
            System.out.println("Room " + getRoomNumber(room) + " is already available.");
        }
    }

    private void checkInToRoom(Guest guest, Room room) {
        int index = getRoomIndex(room);
        if (index != -1) {
            guests[index] = guest;
        }
    }

    private void checkOutFromRoom(Room room) {
        int index = getRoomIndex(room);
        if (index != -1) {
            guests[index] = null;
        }
    }

    private int getRoomNumber(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == room) {
                return i + 1;
            }
        }
        return -1; // Invalid room
    }

    private Guest getGuestInRoom(Room room) {
        int index = getRoomIndex(room);
        if (index != -1) {
            return guests[index];
        }
        return null; // Invalid room
    }

    private int getRoomIndex(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == room) {
                return i;
            }
        }
        return -1; // Invalid room
    }
}
