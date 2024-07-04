package lesson35.classwork35.TaskFourth;



import lesson35.classwork35.Task01.Person;

import java.util.Objects;

public class Book {

    private String name;

    private lesson35.classwork35.Task01.Person borrowedBy;

    public Book(String name, lesson35.classwork35.Task01.Person borrowedBy) {
        this.name = name;
        this.borrowedBy = borrowedBy;
    }

    public Book(String дубровский, lesson35.classwork35.TaskFourth.Person artur) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public lesson35.classwork35.Task01.Person getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Person borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", borrowedBy=" + borrowedBy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        lesson35.classwork35.Task01.Book book = (lesson35.classwork35.Task01.Book) o;
        return Objects.equals(name, book.getName()) && Objects.equals(borrowedBy, book.getBorrowedBy());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(borrowedBy);
        return result;
    }


}
