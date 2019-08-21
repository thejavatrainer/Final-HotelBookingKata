/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.booking;

import com.javatrainer.employees.EmployeeId;
import java.time.Instant;

/**
 * Allows employees to book rooms at hotels.
 * <p>
 * Rules
 * <p>
 * Check out date must be at least one day after the check in date. Validate if the hotel exists and room type is provided by the hotel Verify if booking is
 * allowed according to the booking policies defined, if any See Booking Policy Service for more details. Booking should only be allowed if there is at least
 * one room type available during the whole booking period. Keep track of all bookings. E.g. If hotel has 5 standard rooms, we should have no more than 5
 * bookings in the same day. Hotel rooms can be booked many times as long as there are no conflicts with the dates. Return booking confirmation to the employee
 * or error otherwise (exceptions can also be used).
 */
public interface BookingService {
    boolean bookRoom(final EmployeeId employeeId, final int roomNumber, final Instant from, final Instant to);
}