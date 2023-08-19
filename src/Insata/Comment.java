package Insata;

import java.time.LocalDate;

public class Comment{

    private static int nextId = 1;
    private int id;
    private String text;
    private LocalDate date;


    public Comment(String text, LocalDate date) {
        this.text = text;
        this.date = date;
        this.id = nextId++;

    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Коментарий: " + text + "\nДата: "+ date +"\nID : "+ id;
    }
}
