/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.javatrainer.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyServiceImpl implements CompanyService {
    private List<Company> companies = new ArrayList<>();

    @Override
    public void addEmployee(final CompanyId companyId, final Employee employee) {
        Company company = getCompany(companyId);
    }

    private Company getCompany(final CompanyId companyId) {
        for (Company company : companies) {
            if (company.getId().equals(companyId)) {
                return company;
            }
        }

        return null;
    }

    @Override
    public void removeEmployee(final CompanyId companyId, final Employee employee) {
    }

    @Override
    public Employee getEmployee(final CompanyId companyId, final EmployeeId employeeId) {
        return null;
    }

    @Override
    public List<Employee> getCompanyEmployees(final CompanyId companyId) {
        return null;
    }
}
