package ru.netology.javaqamvn.manager;

public class Manager {
    private String[] films = new String[0];
    private int limit;

    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        int resultLength;
        if (films.length < 5) {
            resultLength = films.length;
        } else {
            resultLength = 5;
        }
        String[] answer = new String[5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = films[films.length - 1 - i];
        }
        return answer;
    }

}


