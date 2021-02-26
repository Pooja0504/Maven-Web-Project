import java.io.*;
class pooja implements Externalizable {
    static int age;
    String name;
    int year;
 
    pooja(String n, int y)
    {
        this.name = n;
        this.year = y;
        age = 10;
    }
 
  
}
 
