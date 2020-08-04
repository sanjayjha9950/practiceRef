package problems.special_string_again;

import data.structure.heap.Main;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Mainclass {
    /*public static void main(String[] args){
        String s1 = "abc";
        String s2 = s1;
        s1+="d";
        System.out.println(s1 + " "+ s2 + " "+(s1==s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " "+ sb2 + " "+(sb1==sb2));
    }*/

    /*static Mainclass t;
    static int count=0;
    public static void main (String[] args) throws InterruptedException{
        Mainclass t1 = new Mainclass();
        t1=null;
        System.gc();
        Thread.sleep(1000);
        t=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("finalize method called "+count+" times");

    }
    @Override
    protected void finalize(){
        count++;
        t=this;
    }*/
    public static void main(String[] args) {

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("text.txt");
            out.write(122);
        }catch (IOException e){

        }
        finally {

        }

    }


}



class Base{
    int i;
    /*public Base()throws IOException{
        System.out.print("Airplane");
        throw new IOException();
    }*/
}
class Derived extends Base{
    public Derived() throws IOException{
        System.out.println("Airjet");

    }

}
