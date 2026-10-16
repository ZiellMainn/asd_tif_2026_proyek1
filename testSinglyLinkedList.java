/**
 * testSinglyLinkedList
 */
public class testSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3
        // get(12) dinonaktifkan sementara: index di luar jangkauan memang melempar IndexOutOfBoundsException
        // (sesuai soal), tapi program jadi berhenti sehingga method lain tidak bisa diuji dalam satu run.
        // System.out.println(linkedList.get(12)); //Terjadi exception error
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        // Pakai Arrays.toString karena println(array) hanya mencetak alamat memori, bukan isinya.
        System.out.println(java.util.Arrays.toString(linkedList.toArray())); //Menghasilkan [6,5,4,3,2,1]
    }
}

//