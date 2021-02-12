package ru.java.prototype;

public class Book implements Copyable {
    private int realiseYear;
    private String name;
    private String author;

    public Book(int realiseYear, String name, String author) {
        this.realiseYear = realiseYear;
        this.name = name;
        this.author = author;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Object copy() {
        Book copy = new Book(realiseYear, name, author);
        return copy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "realiseYear=" + realiseYear +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
