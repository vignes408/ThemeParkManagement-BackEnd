package com.vickee.serviceimpl;

import com.vickee.model.Ride;
import com.vickee.repository.RideRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class RideServiceImplTest {

    @Mock
    private RideRepo repo;

    @InjectMocks
    private RideServiceImpl rideService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddRides() {
        Ride ride = new Ride();
        rideService.addRides(ride);
        verify(repo, times(1)).save(ride);
    }

    @Test
    public void testGetAllRides() {
        // Given
        Ride ride1 = new Ride();
        Ride ride2 = new Ride();
        List<Ride> rides = Arrays.asList(ride1, ride2);
        when(repo.findAll()).thenReturn(rides);
        List<Ride> result = rideService.getAllRides();
        assertEquals(rides, result);
        verify(repo, times(1)).findAll();
    }
}
