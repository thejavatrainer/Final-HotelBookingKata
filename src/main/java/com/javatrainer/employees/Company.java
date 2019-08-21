/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final CompanyId id;
    private final String name;
    private final List<Employee> employees;

    public Company(final CompanyId id, final String name) {
        this.id = id;
        this.name = name;
        employees = new ArrayList<>();
    }

    public CompanyId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
