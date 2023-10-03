package ru.netology.javaqamvn.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void zeroFilm() {
        Manager manager = new Manager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneFilm() {
        Manager manager = new Manager();
        manager.addFilms("Вперед 1");
        String[] expected = {"Вперед 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void twoFilms() {
        Manager manager = new Manager();
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        String[] expected = {"Вперед 1", "Джентельмены 2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void threeFilms() {
        Manager manager = new Manager();
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        String[] expected = {"Вперед 1", "Джентельмены 2", "Номер один 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContrary() {
        Manager manager = new Manager(3);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        String[] expected = {"Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
