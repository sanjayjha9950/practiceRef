package data.structure.hashtable;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        this.hashtable = new StoredEmployee[10];
    }

    public void put (String key , Employee employee){
        int hashedKey = hashkey(key);
        if (occupied(hashedKey)){
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length-1){
                hashedKey =0;
            }else {
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey!= stopIndex){
                hashedKey = (hashedKey+1) % hashtable.length;
            }
        }
        if (occupied(hashedKey))
            System.out.println("Sorry there is already an employee at position : "+hashedKey);
        else
            hashtable[hashedKey] = new StoredEmployee(key,employee);
    }

    public Employee get (String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;

        return hashtable[hashedKey].employee;
    }

    private int findKey(String key){
        int hashedKey = hashkey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length-1){
            hashedKey =0;
        }
        else {
            hashedKey++;
        }
        while(hashedKey!= stopIndex &&
                hashtable[hashedKey]!=null &&
                !hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1) % hashtable.length;
        }
        if (hashtable[hashedKey] !=null &&
                hashtable[hashedKey].key.equals(key))
            return hashedKey;
        else
            return -1;
    }


    private int hashkey(String key) {
        return key.length() % hashtable.length;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i =0; i< oldHashTable.length;i++){
            if (oldHashTable[i] != null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    public void printHashtable(){
        for (int i =0; i<hashtable.length;i++){
            if (hashtable[i]==null)
                System.out.println("empty");
            else
                System.out.println("Postion : " + i+": "+hashtable[i].employee);
        }
    }

    private boolean occupied (int index){
        return hashtable[index]!=null;
    }
}
