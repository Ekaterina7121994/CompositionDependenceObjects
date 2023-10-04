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
        Manager manager = new Manager(4);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        String[] expected = {"Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryMoreFiveBoundary() {
        Manager manager = new Manager(6);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        manager.addFilms("Бладшот 5");
        manager.addFilms("Тролли 6");
        String[] expected = {"Тролли 6", "Бладшот 5", "Человек-невидимка 4", "Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryLessFiveBoundary() {
        Manager manager = new Manager(4);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        String[] expected = {"Человек-невидимка 4", "Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryEqualFive() {
        Manager manager = new Manager();
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        manager.addFilms("Бладшот 5");
        String[] expected = {"Бладшот 5", "Человек-невидимка 4", "Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryLessFive() {
        Manager manager = new Manager();
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        manager.addFilms("Бладшот 5");
        manager.addFilms("Тролли 6");
        manager.addFilms("Маша 7");
        manager.addFilms("Зеленая миля 8");
        manager.addFilms("Кот 9");
        String[] expected = {"Кот 9", "Зеленая миля 8", "Маша 7", "Тролли 6", "Бладшот 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryLessLimit() {
        Manager manager = new Manager(9);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        manager.addFilms("Бладшот 5");
        String[] expected = {"Бладшот 5", "Человек-невидимка 4", "Номер один 3", "Джентельмены 2", "Вперед 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onTheContraryLessThree() {
        Manager manager = new Manager(3);
        manager.addFilms("Вперед 1");
        manager.addFilms("Джентельмены 2");
        manager.addFilms("Номер один 3");
        manager.addFilms("Человек-невидимка 4");
        manager.addFilms("Бладшот 5");
        manager.addFilms("Тролли 6");
        manager.addFilms("Маша 7");
        manager.addFilms("Зеленая миля 8");
        manager.addFilms("Кот 9");
        String[] expected = {"Кот 9", "Зеленая миля 8", "Маша 7"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}