/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.employees;

import java.util.List;

/**
 * Employees should not be duplicated. When deleting an employee, all the bookings and policies associated to the employee should also be deleted from the
 * system.
 */
public interface CompanyService {
    void addEmployee(CompanyId companyId, Employee employee);

    void removeEmployee(CompanyId companyId, Employee employee);

    Employee getEmployee(CompanyId companyId, EmployeeId employeeId);

    List<Employee> getCompanyEmployees(CompanyId companyId);
}
