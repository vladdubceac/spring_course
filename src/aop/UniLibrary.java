package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

//    @Override
//    public void getBook(Book book){
//        System.out.println("We take the book from UniLibrary "+book.getName());
//    }

    public void getBook(){
        System.out.println("We take the book from UniLibrary ");
        System.out.println("---------------------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("We return the book to UniLibrary");
//        System.out.println("---------------------------------------");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("We take magazine from UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazin to UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add book to UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine to UniLibrary");
        System.out.println("---------------------------------------");
    }
}
