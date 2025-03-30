package data.structure.lists;

public class PartitionMain {

    public static void main(String[] args) {

        // Create a new LinkedList and append values to it
        LinkedListPartition myLinkedList = new LinkedListPartition(1);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        // Print the list before partitioning
        System.out.println("LL before duplicatesRemoved:");
        myLinkedList.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        //myLinkedList.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after duplicates removed:");
        //myLinkedList.printList(); // Output: 3 2 1 5 8 10

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }
}
