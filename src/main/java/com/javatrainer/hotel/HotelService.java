/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.hotel;

/**
 * Used by the hotel manager to define the types and number of rooms of each type the hotel has.
 */
public interface HotelService {
    void addRoom(int number, RoomCategory category);

    void deleteRoom(int number);

    void upgradeRoomCategory(int number, RoomCategory category);
}
