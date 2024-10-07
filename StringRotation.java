public class StringRotation {
    // Function to check if str2 is a rotation of str1
    static boolean areRotations(String str1, String str2) {
        // Check if lengths are equal and str2 is a substring of str1 concatenated with itself
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (areRotations(str1, str2)) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }
    }
}

=====================================================================================================
public class PrintNext20LeapYear
{

    public static void main(String[] args) {
       int year = 2024; // Starting year
        int count = 0; // Counter for leap years

        while (count < 20) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year);
                count++;
            }
            year++;
        }
    }
}
=============================================================================================================
public class ConvertNoIntoWord
{public static void main(String args[]){
	
		int n=13;
		int n1=n,n2=n;
		int b=n1%10,a=n2/10; //  n1/10 means last digit is removed and n2%10 means last digit by modulus

		String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
		String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
		String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
		if(a==1)
		{
			System.out.println(two_digits[b+1]);
		}
		else if(b==0)
			System.out.println(tens_multiple[a]);
		else
			System.out.println(tens_multiple[a]+"-"+single_digits[b]);
	}//main
}
=============================================================================================================
import java.util.*;
public class NumberToArray
{   public static void main(String[] args) {
        int number = 12345;
        int[] digits = getDigits(number);
        
        // Print the array
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }

    public static int[] getDigits(int number) {
        List<Integer> digitList = new ArrayList<>();
        
        // Extract digits
        while (number > 0) {
            digitList.add(0, number % 10); // Add digit to the front of the list
            number /= 10;
        }
        
        // Convert list to array
        int[] digits = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            digits[i] = digitList.get(i);
        }
        
        return digits;
    }
}
=================================================================================================================
import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node head;

    void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(21);
        list.push(43);
        list.push(41);
        list.push(21);
        list.push(12);
        list.push(11);
        list.push(12);

        System.out.println("Linked List before removing duplicates:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Linked List after removing duplicates:");
        list.printList();
    }
}
=================================================================================================================
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at the front of the list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Method to get the count of nodes in the linked list
    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        System.out.println("Count of nodes is " + llist.getCount());
    }
}
===========================================================================================================
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move pointers one position ahead
            current = next;
        }
        return prev; // New head of the reversed list
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

