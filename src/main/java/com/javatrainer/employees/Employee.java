/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.employees;

public class Employee {
    private final String id;
    private final String name;
    private final Integer salary;

    public Employee(final String id, final String name, final Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }
}
