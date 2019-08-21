package com.javatrainer.booking;

import com.javatrainer.employees.CompanyService;
import com.javatrainer.employees.EmployeeId;
import com.javatrainer.hotel.HotelService;
import com.javatrainer.policy.BookingPolicyService;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class BookingServiceTest {
    private HotelService hotelService;
    private CompanyService companyService;
    private BookingPolicyService bookingPolicyService;
    private BookingService bookingService;

    @BeforeEach
    void setUp() {
        hotelService = mock(HotelService.class);
        companyService = mock(CompanyService.class);
        bookingPolicyService = mock(BookingPolicyService.class);
        bookingService = new BookingServiceImpl();
    }

    @Test
    public void book_policyAllowsBooking_returnsTrue() {
        // Given
        EmployeeId employeeId = new EmployeeId(UUID.randomUUID().toString());

        // When

        // Then
    }
}