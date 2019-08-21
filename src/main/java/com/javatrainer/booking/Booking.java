/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.booking;

import com.javatrainer.employees.EmployeeId;
import java.time.Instant;

public class Booking {
    private final EmployeeId employeeId;
    private final int roomNumber;
    private final Instant from;
    private final Instant to;

    public Booking(final EmployeeId employeeId, final int roomNumber, final Instant from, final Instant to) {
        this.employeeId = employeeId;
        this.roomNumber = roomNumber;
        this.from = from;
        this.to = to;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Instant getFrom() {
        return from;
    }

    public Instant getTo() {
        return to;
    }
}
