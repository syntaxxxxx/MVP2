package com.fiqri.mvp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    MainPresenter presenter;
    MainView view;

    @Before
    public void setUp() {
        view = mock(MainView.class);
        presenter = new MainPresenter();
    }

    @Test
    public void calculate() {
        double result = presenter.calculate(12, 12);
        assertEquals(144, result, 0.0001);
    }
}