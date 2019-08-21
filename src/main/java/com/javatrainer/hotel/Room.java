/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.hotel;

public class Room {
    private final int number;
    private final RoomCategory category;

    public Room(final int number, final RoomCategory category) {
        this.number = number;
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public RoomCategory getCategory() {
        return category;
    }
}
