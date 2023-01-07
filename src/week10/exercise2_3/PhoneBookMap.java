package week10.exercise2_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String,Student> phoneBook;
    public PhoneBookMap(){
        this.phoneBook = new HashMap<>();
    }
    public void addPerson(Student s){
        phoneBook.put(s.phone,s);
    }
    public Student searchByName(String name){
        for(Student student : phoneBook.values()){
            if(student.name.equals(name)){
                return student;
            }
        }
        return null;
    }
    public Student searchByLastName(String lastname){
        for(Student student : phoneBook.values()){
            if(student.lastname.equals(lastname)){
                return student;
            }
        }
        return null;
    }
    public Student searchByNumber(String phone){
        for(Student student : phoneBook.values()){
            if(student.phone.equals(phone)){
                return student;
            }
        }
        return null;
    }
    public void deleteByNumber(String phone){
        for(Student student : phoneBook.values()){
            if(student.phone.equals(phone)){
                student = null;
            }
        }
    }
}
