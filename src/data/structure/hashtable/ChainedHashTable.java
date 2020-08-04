package data.structure.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for( int  i =0; i< hashtable.length;i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashkey(String key) {
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void put (String key, Employee employee){
        int hashedKey = hashkey(key);
        hashtable[hashedKey].add(new StoredEmployee(key,employee));
    }

    public Employee remove (String key){
        int hashedKey = hashkey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index =-1;
        while (iterator.hasNext()){
            employee = iterator.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }

        if (employee== null || !employee.key.equals(key)){
            return null;
        }
        else {
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }

    }

    public Employee get (String key){
        int hashedKey = hashkey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public void printHashTable(){
        for (int i =0;i<hashtable.length; i++){
            if (hashtable[i].isEmpty()){
                System.out.println("Postion "+i+" : Empty");
            }else {
                System.out.print("Position " +i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }


}
