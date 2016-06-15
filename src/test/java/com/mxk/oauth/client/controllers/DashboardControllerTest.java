package com.mxk.oauth.client.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DashboardControllerTest {

    @InjectMocks
    private DashboardController dashboardController;

    @Test
    public void testGetDashboard() {
        String page = dashboardController.get();
        assertEquals("dashboard", page);
    }

}