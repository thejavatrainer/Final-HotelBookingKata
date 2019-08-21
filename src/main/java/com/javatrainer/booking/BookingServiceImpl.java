/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.booking;

import com.javatrainer.employees.EmployeeId;
import java.time.Instant;

public class BookingServiceImpl implements BookingService {

    @Override
    public boolean bookRoom(final EmployeeId employeeId, final int roomNumber, final Instant from, final Instant to) {
        return true;
    }
}
