package com.vickee.serviceimpl;

import com.vickee.model.Role;
import com.vickee.repository.RoleRepo;
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
public class RoleServiceimplTest {

    @Mock
    private RoleRepo repo;

    @InjectMocks
    private RoleServiceimpl roleService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllNames() {
        // Given
        List<String> names = Arrays.asList("ADMIN", "USER");
        when(repo.fetchAllNames()).thenReturn(names);

        // When
        List<String> result = roleService.getAllNames();

        // Then
        assertEquals(names, result);
        verify(repo, times(1)).fetchAllNames();
    }

    @Test
    public void testGetAllRoles() {
        // Given
        Role role1 = new Role();
        Role role2 = new Role();
        List<Role> roles = Arrays.asList(role1, role2);
        when(repo.findAll()).thenReturn(roles);

        // When
        List<Role> result = roleService.getAllRoles();

        // Then
        assertEquals(roles, result);
        verify(repo, times(1)).findAll();
    }

    @Test
    public void testFetchRoleByName() {
        // Given
        String name = "ADMIN";
        Role role = new Role();
        when(repo.fetchRoleByName(name)).thenReturn(role);

        // When
        Role result = roleService.fetchRoleByName(name);

        // Then
        assertEquals(role, result);
        verify(repo, times(1)).fetchRoleByName(name);
    }

    @Test
    public void testFetchAllRids() {
        // Given
        List<Long> rids = Arrays.asList(1L, 2L);
        when(repo.fetchAllRids()).thenReturn(rids);
        List<Long> result = roleService.fetchAllRids();
        assertEquals(rids, result);
        verify(repo, times(1)).fetchAllRids();
    }

    @Test
    public void testAddRole() {
        // Given
        Role role = new Role();

        // When
        roleService.addRole(role);

        // Then
        verify(repo, times(1)).save(role);
    }
}
