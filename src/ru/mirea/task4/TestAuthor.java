package ru.mirea.task4;

public class TestAuthor {
    public static void main(String [] args){
        Author ob1 = new Author("izadine", "izadine1232@gamil.com", 'M');
        Author  ob2 = new Author("adam", "adam1232@gamil.com", 'M');
        Author ob3 = new Author("tire", "tire@gamil.com", 'M');
        System.out.println(ob1);
        ob1.setName("tanda");
        System.out.println(ob1);
    }
}