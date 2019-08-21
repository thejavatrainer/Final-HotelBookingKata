/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.policy;

import com.javatrainer.employees.CompanyId;
import com.javatrainer.employees.EmployeeId;
import com.javatrainer.hotel.RoomCategory;
import java.util.List;

/**
 * Allows company admins to create booking policies for their company and employees. Booking policies determine if an employee booking request is allowed by
 * their company. There are two types of booking policy:
 * <p>
 * Company Booking Policy: Indicates which type of rooms can be booked. E.g. a company may only allow standard (single/double) rooms to be booked. Or it may
 * allow standard and junior suite rooms.
 * <p>
 * Employee Booking Policy: Indicates which type of rooms a specific employee can book. E.g. One employee might only be allowed to book a standard room while
 * another employee may be allowed to book standard, junior suite and master suite.
 *
 * Employee policies take precedence over company policies. If there is a policy for an employee, the policy should be respected regardless of what the
 * company policy (if any) says.
 * If an employee policy does not exist, the company policy should be checked.
 * If neither employee nor company policies exist, the employee should be allowed to book any room.
 */
public interface BookingPolicyService {
    void setCompanyPolicy(CompanyId companyId, RoomCategory roomCategory);

    void setEmployeePolicy(EmployeeId employeeId, List<RoomCategory> roomCategory);

    boolean isBookingAllowed(EmployeeId employeeId, RoomCategory roomCategory);
}
