package week10.exercise2_3;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook) {
            if (student.lastname.equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    public void deleteByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.phone.equals(phone)) {
                student = null;
            }
        }
    }
}
