package com.javatrap2020_full_examples_java_collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class AllCollectionJava {

    private final static Logger logger = Logger.getLogger(AllCollectionJava.class.getName());

    final static String dashed = "----------------------";
    static int count = 0;
    final static LocalTime timeStart = LocalTime.now();
    final static NamesEnum nameOne = NamesEnum.ITERABLE;
    final static NamesEnum nameTwo = NamesEnum.COLLECTION;
    final static NamesEnum nameThree = NamesEnum.COLLECTION_SET;
    final static NamesEnum nameFour = NamesEnum.COLLECTION_SET_HASH_SET;
    final static NamesEnum nameFive = NamesEnum.COLLECTION_SET_LINKED_HASH_SET;
    final static NamesEnum nameSix = NamesEnum.COLLECTION_SET_TREE_SET;
    final static NamesEnum nameSeven = NamesEnum.COLLECTION_LIST;
    final static NamesEnum nameEight = NamesEnum.COLLECTION_LIST_ARRAY_LIST;
    final static NamesEnum nameNine = NamesEnum.COLLECTION_LIST_LINKED_LIST;
    final static NamesEnum nameTen = NamesEnum.COLLECTION_LIST_VECTOR;
    final static NamesEnum nameEleven = NamesEnum.COLLECTION_LIST_VECTOR_STACK;
    final static NamesEnum nameTwelve = NamesEnum.COLLECTION_QUEUE_PRIORITY_QUEUE;
    final static NamesEnum nameThirteen = NamesEnum.COLLECTION_DEQUE_ARRAY_DEQUE;
    final static NamesEnum nameFourteen = NamesEnum.MAP_HASH_MAP;
    final static NamesEnum nameFifteen = NamesEnum.MAP_HASH_MAP_LINKED_HASH_MAP;
    final static NamesEnum nameSixteen = NamesEnum.MAP_SORTED_MAP_NAVIGABLE_MAP_TREE_MAP;
    final static NamesEnum getNameSeventeen = NamesEnum.COLLECTIONS;
    final static NamesEnum getNameEighteen = NamesEnum.ARRAYS;
    
    public static void main(String[] args) {
        NamesAll n = new NamesAll(nameOne);
        n.tellName();
        numDashedLine();
        /*
        The first way to iterable the elements of a Java Iterable is via the
        Java for-each loop.Below showing how iterate the elements of a java List
        via the Java for-each loop.Since the Java List interface extends the
        Collection interface, and the Collection interface extends the Iterable
        interface, a List Object can be used with the for-each loop.
        */

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        for (String element : list) {
            System.out.println(element);
        }
        /*
        This example first creates a new List and adds 3 elements to it. Then it
        uses a for-each loop to iterate the elements of the List, and
        print out the toString() value of each element.
        */

        /*
        The second way you can iterate the elements of a Java Iterable is
        by obtaining a Java Iterator from it by calling the Iterable iterator()
        method. You can then iterate through that that Iterator like you would
        with any other Iterator. Here is an example of iterating the elements
        of a Java Iterable (a Java List in this example):
        */
        n.tellName();
        dashedLine();

        List<String> listTwo = new ArrayList<>();

        listTwo.add("one");
        listTwo.add("two");
        listTwo.add("three");

        Iterator<String> iterator = listTwo.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        n.tellName();
        dashedLine();

        /*
        The third way to iterate the elements of a Java Iterable is via its
        forEach() method. The forEach() method takes a Java Lambda Expresion
        as parameter. This lambda expression is called once for each element
        in the Iterable.
         */
        List<String> listThree = new ArrayList<>();

        listThree.add("one");
        listThree.add("two");
        listThree.add("three");

        listThree.forEach((element) -> {
            System.out.println(element);
        });
        /*
        The Java Iterable interface has three methods of which only one needs
        to be implemented. The other two have default implementations.

        public interface Iterable<T> {
            Iterator<T> iterator();
            Spliterator<T> spliterator();
            void forEach(Consumer<? super T> action);
        }

        The method you must implement is named iterator(). This method must return
        a Java Iterator which can be used to iterate the elements of the object
        implementing the Iterable interface. Obtaining the Iterator happens
        behind the scenes, so you don't see that done. The Java compiler takes
        care of generating the code for that, when you use a Iterable with the
        for-each loop.

        The Java Iterable interface (java.lang.Iterable) is one of the root interfaces
        of Java Collections API. Therefore, there are several classes in Java that
        implements the Java Iterable interface. These classes can thus have their
        internal elements iterated.
        There are also several Java interfaces that extends the Iterable interface.
        Classes implementing an interface which extends the Iterable interface thus
        also implement the Iterable interface. Such classes can also have their elements
        iterated.
        The Collection interface extends Iterable, so all subtypes of Collection also
        implement the Iterable interface. For instance, both the Java List and Set
        interfaces extend the Collection interface, and thereby also the Iterable
        interface.
        */

        /*
        How can we implement a custom iterable in Java?
        An Iterable interface is defined in java.lang package and introduced with
        Java 5 version. An object that implements this interface allows it to be
        the target of the "for-each" statement. This for-each loop is used
        for iterating over arrays and collections. An Iterable interface can
        also be implemented to create custom behavior.
         */
        n.tellName();
        dashedLine();

        Person personOne = new Person("Javatrap2020", "Java", 20);
        Person personTwo = new Person("John", "Jo", 30);
        Persons personsList = new Persons();
        personsList.addPerson(personOne);
        personsList.addPerson(personTwo);
        for (Person person : personsList) {
            System.out.println(person);
        }
        /*
        Java Collection Framework offers the capability to Java Collection to
        represent a group of elements in classes and Interfaces

        Java Collection Framework enables the user to perform various data
        manipulation operations like storing data, searching, sorting, insertion,
        deletion, and updating of data on the group of elements.
         */

        /*
        METHODS OF COLLECTION INTERFACE
        -------------------------------

        1.public boolean add(E e)      Add objects to collection.

        2.public boolean addAll(Collection<? extends E> c) It is used to insert the
                                                        specified collection elements
                                                        in the invoking collection.

        3.public boolean remove(Object element)  It is used to delete an element
                                               from the collection

        4.default boolean removeAll(Collection<?> c)  It is used to delete all
                                                    the elements off the specified
                                                    collection from the invoking
                                                    collection.

        5.default boolean removeIf(Predicate<? super E> filter) It is used to delete
                                                              all the elements of
                                                              the collection that
                                                              satisfy the specified.

        6.public boolean retainAll(Collection<?> c)  It is used to delete all the
                                                     elements of invoking collection
                                                     except the specified collection.

        7.public int size()    It returns the total number of elements in the collection.

        8.public void clear()  It removes the total number of elements from the collection.

        9.public boolean contains(Object element) It is used to search an element.

        10.public boolean containsAll(Collection<?> c) It is used to search the
                                                       specified collection in the
                                                       collection.

        11.public Iterator iterator()   It returns an iterator.

        12.public Object[] toArray()    It converts collection into array.

        13.public <T> T[] toArray(T[] a)  It converts collection into
                                          array. Here, the runtime type
                                          of the returned array is that
                                          of the specified array.

        14.public boolean isEmpty()  It checks if collection is empty.

        15.default Stream<E> parallelStream() It returns a possibly parallel Stream
                                              with the collection as its source.

        16.default Stream<E> stream()    It returns a sequential Stream with
                                         the collection as its source.

        17.default Spliterator<E> spliterator()  It generates a Spliterator over
                                                 the specified elements in the
                                                 collection.

        18.public boolean equals(Object element) It matches two collections.

        19.public int hashCode() It returns the hash code number of the collection.

         */
        /*
        Set interface
        The set interface is inherited from the Java collection interface a Set interface
        cannot store duplicate/redundant elements in it. Here's an example based on a set interface
         */
        NamesAll n2 = new NamesAll(nameFour);
        n2.tellName();
        numDashedLine();

        int count[] = {21, 23, 43, 53, 22, 65, 22};

        Set<Integer> set = new HashSet<>();

        try {
            for (int i = 0; i <= count.length - 1; i++) {
            //for (int i = 0; i <= 7; i++) { //ERROR BOOM!
                set.add(count[i]);
            }
            System.out.println(set);
            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is");
            System.out.println(sortedSet);
            System.out.println("First element of the set is: " + sortedSet.first());
            System.out.println("last element of the set is: " + sortedSet.last());
        } catch (Exception e) {
            logger.info("BOOM!" + e.getMessage());
        }
                /*
        Set interface
        Set Interface in Java is present in java.util package. It extends the Collection interface.
        It represents the unordered set of elements which doesn't allow us to store the duplicate
        items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet,
        and TreeSet.
        Set can be instantiated as:
        Set<data-type> s1 = new HashSet<data-type>();
        Set<data-type> s2 = new LinkedHashSet<data-type>();
        Set<data-type> s3 = new TreeSet<data-type>();
         */
        n2.tellName();
        dashedLine();
        /*
        HashSet
        HashSet class implements Set Interface. It represents the collection that
        uses a hash table for storage. Hashing is used to store the elements
        in the HashSet. It contains unique items.
         */
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Trap");
        set1.add("Java");
        set1.add("ABC");
        set1.add("D");
        set1.add("F");
        set1.add("J");
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        NamesAll n3 = new NamesAll(nameFive);
        n3.tellName();
        numDashedLine();
        /*
        LinkedHashSet
        LinkedHashSet class represents the LinkedList implementation of Set Interface. It
        extends the HashSet class and implements Set interface. Like HashSet, it also
        contains unique elements. It maintains the insertion order and permits null elements.
         */
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Java");
        set2.add("Trap");
        set2.add("Java");
        set2.add("ABC");
        set2.add("D");
        set2.add("F");
        Iterator<String> itr2 = set2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        NamesAll n4 = new NamesAll(nameSix);
        n4.tellName();
        numDashedLine();

        /*
        SortedSet Interface
        SortedSet is the alternate of Set interface that provides a total ordering
        on its elements. The elements of the SortedSet are arranged in the
        increasing (ascending) order. The SortedSet provides the additional methods
        that inhibit the natural ordering of the elements.
        SortedSet<data-type> set = new TreeSet();

         */
        /*
        TreeSet
        Java TreeSet class implements the Set interface that uses a tree for storage.
        Like HashSet, TreeSet also contains unique elements. However, the access and
        retrieval time of TreeSet is quite fast. The elements in TreeSet stored
        in ascending order.
         */
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Java");
        set3.add("Trap");
        set3.add("Java");
        set3.add("ABC");
        set3.add("F");
        set3.add("D");
        set3.add("A");
        Iterator<String> itr3 = set3.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        n4.tellName();
        dashedLine();
        SortedSet set4 = new TreeSet();
        set4.add("John");
        set4.add("Bob");
        set4.add("Smith");
        Iterator iterator1 = set4.iterator();
        while (iterator1.hasNext()) {
            Object element = iterator1.next();
            System.out.println(element.toString());
        }

        NamesAll n5 = new NamesAll(nameEight);
        n5.tellName();
        numDashedLine();

        /*
        List interface
        List interface is the child interface of Collection interface. It
        inhibits a list type data structure in which we can store the
        ordered collection of objects. It can have duplicate values.
        List interface is implemented by the class ArrayList, LinkedList, Vector, and Stack.
        List <data-type> list1 = new ArrayList();
        List <data-type> list1 = new LinkedList();
        List <data-type> list1 = new Vector();
        List <data-type> list1 = new Stack();
        Methods in List interface that can be used to insert, delete, and access the elements
        from the list.

         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Trap");
        stringList.add("Java");
        stringList.add("ABC");
        stringList.add("A");
        stringList.add("A");
        for (String allList : stringList)
            System.out.println(allList);

        n5.tellName();
        dashedLine();
        /*
        ArrayList
        The ArrayList class implements the List interface. It uses a dynamic array to store
        the duplicate element of different data types. The ArrayList class maintains
        the insertion order and is non-synchronized. The elements stored in the ArrayList
        class can be randomly accessed.
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Trap");
        arrayList.add("Java");
        arrayList.add("ABC");
        arrayList.add("F");
        arrayList.add("A");

        Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        n5.tellName();
        dashedLine();
        /*
        Get and Set ArrayList
         */
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mango");
        arrayList1.add("Apple");
        arrayList1.add("Banana");
        arrayList1.add("Grapes");
        System.out.println(arrayList1);
        System.out.println("GEt: " + arrayList1.get(1));
        arrayList1.set(1,"Dates");
        for (String fruit : arrayList1) {
            System.out.println("After SET: " + fruit);
        }

        n5.tellName();
        dashedLine();
        /*
        to sort ArrayList
         */
        List<String> listA1 = new ArrayList<>();
        listA1.add("Mango");
        listA1.add("Apple");
        listA1.add("Banana");
        listA1.add("Grapes");
        System.out.println("Before: " + listA1);
        Collections.sort(listA1);
        for (String fruit : listA1) {
            System.out.println("After: " + fruit);
        }

        List<Integer> listA2 = new ArrayList<>();
        listA2.add(21);
        listA2.add(11);
        listA2.add(51);
        listA2.add(1);
        System.out.println("Before: " + listA2);
        Collections.sort(listA2);
        for (Integer digits : listA2) {
            System.out.println("After: " + digits);
        }

        n5.tellName();
        dashedLine();
        /*
        Ways to iterate the elements of the collection in Java
        1. By Iterator interface.
        2. By for-each loop.
        3. By ListIterator interface.
        4. By for loop.
        5. By forEach() method.
        6. By forEachRemaining() method.
         */
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Row");
        arrayList2.add("V");
        arrayList2.add("ABC");
        arrayList2.add("F");
        System.out.println("ListIterator: ");
        ListIterator<String> listIterator = arrayList2.listIterator(arrayList2.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }

        System.out.println("for loop: ");
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }

        System.out.println("forEach(): ");
        arrayList2.forEach(a -> {
            System.out.println(a);
        });

        System.out.println("forEachRemaining(): ");
        Iterator<String> iterator10 = arrayList2.iterator();
        iterator10.forEachRemaining(a -> {
            System.out.println(a);
        });

        n5.tellName();
        dashedLine();
        /*
        User-defined class objects in Java ArrayList
         */
        Student student1 = new Student(101, "Java", 25);
        Student student2 = new Student(102, "Trap", 20);
        Student student3 = new Student(103, "ABC", 15);

        ArrayList<Student> arrayList3 = new ArrayList<>();
        arrayList3.add(student1);
        arrayList3.add(student2);
        arrayList3.add(student3);
        System.out.println("Student class objects: ");
        Iterator iterator11 = arrayList3.iterator();
        while (iterator11.hasNext()) {
            Student student = (Student)iterator11.next();
            System.out.println(student.getNumber() + " " +
                    student.name + " " + student.age);
        }

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList Serialization and Deserialization
         */
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Java");
        arrayList4.add("V");
        arrayList4.add("ABC");

        try {
            System.out.println("Serialization");
            FileOutputStream fileOutputStream = new FileOutputStream("file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList4);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Deserialization");
            FileInputStream fileInputStream = new FileInputStream("file");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList arrayList5 = (ArrayList)objectInputStream.readObject();
            System.out.println(arrayList5);
        } catch (Exception e) {
            System.out.println(e);
        }

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList to add elements
         */
        ArrayList<String> arrayList5 = new ArrayList<>();
        System.out.println("Initial list:" + arrayList5);
        arrayList5.add("Java");
        arrayList5.add("V");
        arrayList5.add("Abc");
        System.out.println("After add:" + arrayList5);
        arrayList5.add(1, "BBB");
        System.out.println("After to add of index 1:" + arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("OOO");
        arrayList6.add("TTT");
        arrayList6.addAll(arrayList6);
        System.out.println("arrayList.add + arrayList6.addAll:" + arrayList6);

        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("KKK");
        arrayList7.add("RRR");
        arrayList5.addAll(1, arrayList7);
        System.out.println("arrayList5.addAll: 1, arrayList7:" + arrayList5);

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList to remove elements
         */
        ArrayList<String> arrayList8 = new ArrayList<>();
        arrayList8.add("Java");
        arrayList8.add("Abc");
        arrayList8.add("R");
        arrayList8.add("D");
        System.out.println("Before:" + arrayList8);
        arrayList8.remove("Abc");
        System.out.println("After remove(object):" + arrayList8);
        arrayList8.remove(0);
        System.out.println("After remove(index):" + arrayList8);

        ArrayList<String> arrayList9 = new ArrayList<>();
        arrayList9.add("S");
        arrayList9.add("W");
        arrayList8.addAll(arrayList9);
        System.out.println("addAll arrayList9 to arrayList8:" + arrayList8);
        arrayList8.removeAll(arrayList9);
        System.out.println("removeAll(arrayList9):arrayList8:" + arrayList8 );
        arrayList8.removeIf(s -> s.contains("R"));
        System.out.println("removeIf(R):" + arrayList8);
        arrayList8.clear();
        System.out.println("clear:" + arrayList8);

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList retainAll()
         */
        ArrayList<String> arrayList10 = new ArrayList<>();
        arrayList10.add("Java");
        arrayList10.add("Abc");
        arrayList10.add("DD");
        ArrayList<String> arrayList11 = new ArrayList<>();
        arrayList11.add("OOO");
        arrayList11.add("Java");
        arrayList10.retainAll(arrayList11);
        Iterator iterator12 = arrayList10.iterator();
        while (iterator12.hasNext()) {
            System.out.println("retainAll:" + iterator12.next());
        }

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList isEmpty
         */
        ArrayList<String> arrayList12 = new ArrayList<>();
        System.out.println("Is ArrayList Empty:" + arrayList12.isEmpty());
        arrayList12.add("Java");
        arrayList12.add("V");
        arrayList12.add("ABC");
        System.out.println("add:");
        System.out.println("Is ArrayList Empty:" + arrayList12.isEmpty());

        n5.tellName();
        dashedLine();
        /*
        Java ArrayList: Book
         */
        List<Book> arrayList13 = new ArrayList<>();

        Book book1 = new Book(101, "Java", "Java", "Java", 5);
        Book book2 = new Book(102, "Java2", "Java2", "Java2", 2);
        Book book3 = new Book(103, "Java3", "Java3", "Java3", 17);

        arrayList13.add(book1);
        arrayList13.add(book2);
        arrayList13.add(book3);

        for (Book b : arrayList13) {
            System.out.println("Book: " +  b.id + " " + b.name + " " + b.author + " " +
                   " " +  b.publisher + " " + b.getQuantity());
        }


        NamesAll n6 = new NamesAll(nameNine);
        n6.tellName();
        numDashedLine();
        /*
        LinkedList
        LinkedList implements the Collection interface. It uses a doubly linked list
        internally to store the elements. It can store the duplicate elements.
        It maintains the insertion order and is not synchronized. In LinkedList,
        the manipulation is fast because no shifting is required.

         */

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Trap");
        linkedList.add("Java");
        linkedList.add("ABC");
        linkedList.add("F");
        linkedList.add("A");
        Iterator<String> iterator3 = linkedList.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        NamesAll n7 = new NamesAll(nameTen);
        n7.tellName();
        numDashedLine();
        /*
        Vector
        Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
        However, it is synchronized and contains many methods that are not the part of
        Collection framework.
         */
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Trap");
        vector.add("Java");
        vector.add("ABC");
        vector.add("F");
        vector.add("A");
        Iterator<String> iterator4 = vector.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }

        NamesAll n8 = new NamesAll(nameEleven);
        n8.tellName();
        numDashedLine();
        /*
        Stack
        The Stack is the subclass of Vector. It implements the last-in-first-out data
        structure, i.e., Stack. The Stack contains all of the methods of
        Vector class and also provides its methods like boolean push(),
        boolean peek(), boolean push(object o), which defines its properties.
         */
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Trap");
        stack.push("Java");
        stack.push("ABC");
        stack.push("A");
        stack.push("F");
        stack.push("W");
        stack.pop();

        Iterator<String> iterator5 = stack.iterator();
        while (iterator5.hasNext()) {
            System.out.println(iterator5.next());
        }

        n8.tellName();
        dashedLine();
        /*
        Array-Based Stack Implementation
        As our first implementation of the stack ADT, we store elements in
        an array, named data, with capacity N for some fixed N. We
        oriented the stack so that the bottom element of the stack
        is always stored in cell data[0], and the top element of the
        stack in cell data[t] for index t that is equal to one
        less that the current size of the stack.
         */

        StackInterface<Integer> stackInterface = new ArrayStack<>();
        stackInterface.push(5);
        stackInterface.push(3);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());
        System.out.println("Is empty ? " + stackInterface.isEmpty());
        System.out.println("pop " + stackInterface.pop());
        System.out.println("Is empty ? " + stackInterface.isEmpty());
        System.out.println("pop " + stackInterface.pop());
        stackInterface.push(7);
        stackInterface.push(9);
        System.out.println("top " + stackInterface.top());
        stackInterface.push(4);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());
        stackInterface.push(6);
        stackInterface.push(8);
        System.out.println("Size " + stackInterface.size());
        System.out.println("pop " + stackInterface.pop());

        n8.tellName();
        dashedLine();
        /*
        Implementing a Stack with a Singly Linked List
        We demonstrate how the Stack interface can be easily implemented
        using a singly linked list for storage. Unlike our array-based
        implementation, the linked-list approach has memory usage
        that is always proportional to the number of actual elements currently
        in the stack, and without an arbitrary capacity limit.

        Singly Linked Lists
        The linked list instance must keep a reference to the first node
        of the list, known as the head. Without an explicit reference to the
        head, there would be no way to locate that node (or indirectly, any
        others). The last node of the list is known as the tail. The tail
        of a list can be found by traversing the linked list - starting at
        the head and moving from one node to another by following each
        node's next reference. We can identify the tail as the node
        having null as its next reference. This process is also known as link
        hopping or pointer hopping.
         */
        StackInterface<Integer> stackInterface2 = new LinkedStack<>();
        stackInterface2.push(6);
        stackInterface2.push(4);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());
        System.out.println("Is empty ? " + stackInterface2.isEmpty());
        System.out.println("pop " + stackInterface2.pop());
        System.out.println("Is empty ? " + stackInterface2.isEmpty());
        System.out.println("pop " + stackInterface2.pop());
        stackInterface2.push(8);
        stackInterface2.push(10);
        System.out.println("top " + stackInterface2.top());
        stackInterface2.push(3);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());
        stackInterface2.push(7);
        stackInterface2.push(9);
        System.out.println("Size " + stackInterface2.size());
        System.out.println("pop " + stackInterface2.pop());

        n8.tellName();
        dashedLine();
        /*
        Java Stack Basics
        A Stack is a data structure where you add elements to the "top"
        of the stack, and also remove elements from the top again.
        This is also referred to as the "Last In First Out (LIFO)" principle.
        In contrast, a Java Queue uses a "First In First Out (FIFO)" principle,
        where elements are added to the end of the queue, and removed from
        the beginning of the queue.
        Stack stack = new Stack();

        Stack with a Generic Type
        Stack<String> stack = new Stack<String>();

        Push Element on Stack
        Once  you have a Java Stack instance, you can push elements to the top
        of the Stack. The elements you push onto the Stack must be Java
        objects.
        stack.push("1");

        Pop Element From Stack
        Once an element has been pushed onto a Java Stack, you can pop that element
        from the Stack again. Once an element is popped off the Stack, the element is
        removed from the Stack. The top element of the Stack is then whatever element
        that was pushed onto the Stack just before the element just popped.
         */
        Stack<String> stack2 = new Stack<>();
        stack2.push("Java");
        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        int index = stack2.search("2");
        int size = stack2.size();
        String topElement = stack2.pop();
        System.out.println(" top:" + topElement + " search:" + index + " size:" + size);
        Iterator iterator6 = stack2.iterator();
        while (iterator6.hasNext()) {
            Object value = iterator6.next();
            System.out.println(value);
        }
        /*
        Process Stack Using Stream
        It is also possible to process the elements on a Java Stack via
        the Java Stream Api. You do so by first obtaining a Stream
        from the Stack via the stream() method.
         */

        Stream stream = stack2.stream();
            stream.forEach((element) -> {
                System.out.println(element);
            });

        n8.tellName();
        dashedLine();
        /*
        Reverse List Using Stack
        You can use a Java Stack to reverse a Java List. You do so
        by pushing all the elements from the List onto the Stack,
        starting with the element with index 0, then 1 etc. Each element
        is removed from the List, then pushed onto the Stack. Once all the elements
        are on the Stack, you pop the elements off one by one and add them
        back to the empty list.
         */

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println(list2);
        Stack<String> stack3 = new Stack<>();

            while (list2.size() > 0) {
                stack3.push(list2.remove(0));
            }
            while (stack3.size() > 0) {
                list2.add(stack3.pop());
            }
            System.out.println("Revers List using Stack: " + list2);

        n8.tellName();
        dashedLine();
        List<String> list3 = new ArrayList<>();
        list3.add("D");
        list3.add("E");
        list3.add("F");
        System.out.println(list3);
        List<String> listN = reverse((ArrayList<String>) list3);
        System.out.println("Revers List using Stack: " + listN);

        NamesAll n9 = new NamesAll(nameTwelve);
        n9.tellName();
        numDashedLine();
        /*
        Queue Interface
        Queue interface maintains the first-in-first-out order. It can be
        defined as an ordered list that is used to hold the elements which
        are about to be processed. There are various classes like PriorityQueue,
        DeQueue, and ArrayDeque which implements the Queue interface.
        Queue<String> q1 = new PriorityQueue();
        Queue<String> q2 = new ArrayDeque();
         */
        /*
        PriorityQueue
        The PriorityQueue class implements the Queue interface.
        It holds the elements or objects which are to be processed
        by their priorities. PriorityQueue doesn't allow null
        values to be stored in the queue.
         */
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Java Trap");
        priorityQueue.add("ABC DFE");
        priorityQueue.add("XYZxyz");
        priorityQueue.add("Rr");
        System.out.println("head: " + priorityQueue.element());
        System.out.println("head: " + priorityQueue.peek());
        System.out.println("iterating the queue elements: ");
        Iterator iterator7 = priorityQueue.iterator();
        while (iterator7.hasNext()) {
            System.out.println(iterator7.next());
        }
        priorityQueue.remove();
        priorityQueue.poll();
        System.out.println("after removing two elements: ");
        Iterator<String> iterator8 = priorityQueue.iterator();
        while (iterator8.hasNext()) {
            System.out.println(iterator8.next());
        }
        NamesAll n10 = new NamesAll(nameThirteen);
        n10.tellName();
        numDashedLine();

        /*
        Deque Interface
        Deque interface extends the Queue interface. In Deque, we can removed
        and add the elements from both the side. Deque stands for a
        double-ended queue which enables us to perform the operations
        at both the ends.
        Deque d = new ArrayDeque();
         */
        /*
        ArrayDeque
        ArrayDeque class implements the Deque interface. It facilitates
        us to use the Deque. Unlike queue, we can add or delete the
        elements from both the ends.
        ArrayDeque is faster than ArrayList and has no capacity restrictions.
         */
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Java");
        deque.add("Trap");
        deque.add("Abc");
        for (String str : deque) {
            System.out.println(str);
        }
        deque.pop();
        deque.removeLast();
        System.out.println("delete first and delete last:");
        for (String str : deque) {
            System.out.println(str);
        }

        NamesAll n11 = new NamesAll(nameFourteen);
        n11.tellName();
        numDashedLine();
        /*
        Java Map Hierarchy
        There are two interfaces for implementing Map in java:
        Map and SortedMap, and three classes: HashMap, LinkedHashMap,
        and TreeMap. A Map doesn't allow duplicate keys, but you can
        have duplicate values. HashMap and LinkedHashMap allow null
        keys and values, but TreeMap doesn't allow any null key or value.
        A Map can't be traversed, so you need to convert it into Set
        using keySet() or entrySet() method.

        HashMap is the implementation of Map, but it doesn't maintain any order.

        LinkedHashMap is the implementation of Map. It inherits
        HashMap class. It maintains insertion order.

        TreeMap is the implementation of Map and SortedMap.It maintains
        ascending order.

         */
        /*
        Java Map HashMap: Non-Generic(Old Style)
         */
        Map map = new HashMap();
        map.put(1, "Java");
        map.put(5, "ABC");
        map.put(2, "Trap");
        map.put(6, "Java");
        Set set5 = map.entrySet();
        Iterator iterator9 = set5.iterator();
        while (iterator9.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator9.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        n11.tellName();
        dashedLine();
        /*
        Java Map HashMap: Generic(New Style)
         */
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(100, "Abc");
        map2.put(101, "Trap");
        map2.put(102, "Java");
        for (Map.Entry m:map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        n11.tellName();
        dashedLine();
        /*
        Java Map HashMap: comparingByKey()
         */
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(100, "ABC");
        map3.put(103, "Trap");
        map3.put(102, "Java");
        map3.entrySet().stream().sorted(Map.
                Entry.
                comparingByKey()).
                forEach(System.out::println);

        n11.tellName();
        dashedLine();
        /*
        Java Map HashMap: comparingByKey() in Descending Order
         */
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(100, "Abc");
        map4.put(101, "Trap");
        map4.put(102, "Java");
        map4.entrySet().stream().sorted(Map.
                Entry.comparingByKey(Comparator.reverseOrder())).
                forEach(System.out::println);

        n11.tellName();
        dashedLine();
        /*
        Java Map HashMap: comparingByValue()
         */
        Map<Integer, String> map5 = new HashMap<>();
        map5.put(100, "Abc");
        map5.put(101, "Vyx");
        map5.put(102, "Rtn");
        map5.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        n11.tellName();
        dashedLine();
        /*
        Java Map HashMap: comparingByValue() in Descending Order
         */
        Map<Integer, String> map6 = new HashMap<>();
        map6.put(100, "Abc");
        map6.put(101, "Vxy");
        map6.put(102, "DDD");
        map6.entrySet().stream().sorted(Map.Entry.comparingByValue(
                Comparator.reverseOrder()))
        .forEach(System.out::println);

        n11.tellName();
        dashedLine();
        /*
        No Duplicate Key on HashMap
         */
        HashMap<Integer, String> map7 = new HashMap<>();
        map7.put(1, "Trap");
        map7.put(2, "Java");
        map7.put(3, "ABC");
        map7.put(1, "Trap");

        for (Map.Entry m : map7.entrySet()){
            System.out.println(m.getKey() + " " +  m.getValue());
        }

        n11.tellName();
        dashedLine();
        /*
        Java HashMap to add() elements
         */
        HashMap<Integer, String> map8 = new HashMap<>();
        map8.put(100, "Abc");
        map8.put(101, "Trap");
        map8.put(102, "Java");

        for(Map.Entry m : map8.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("map8.PutIfAbsent()");
        map8.putIfAbsent(103, "DDD");
        for (Map.Entry m : map8.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("map9.put() + putAll(map8)");
        HashMap<Integer, String> map9 = new HashMap<>();
        map9.put(104, "BBB");
        map9.putAll(map8);
        for (Map.Entry m : map9.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        n11.tellName();
        dashedLine();
        /*
        Java HashMap to remove() elements
         */
        HashMap<Integer, String> map10 = new HashMap<>();
        map10.put(100, "Abc");
        map10.put(101, "V");
        map10.put(102, "B");
        map10.put(103, "G");
        System.out.println(map10);
        map10.remove(100);
        System.out.println("After remove: " + "\n" + map10);
        map10.remove(101);
        System.out.println(map10);
        map10.remove(102);
        System.out.println(map10);

        n11.tellName();
        dashedLine();
        /*
        Jav HashMap example to replace() elements
         */
        HashMap<Integer, String> map11 = new HashMap<>();
        map11.put(100, "Abc");
        map11.put(101, "V");
        map11.put(102, "R");
        for (Map.Entry m : map11.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("replace() : ");
        map11.replace(102, "TR");
        for (Map.Entry m : map11.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("replace() : ");
        map11.replace(101, "V", "MM");
        for (Map.Entry m : map11.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("replaceAll() : ");
        map11.replaceAll((k, v) -> "TTT");
        for (Map.Entry m : map11.entrySet()) {
            System.out.println(m.getKey() + " " +  m.getValue());
        }

        NamesAll n12 = new NamesAll(nameFifteen);
        n12.tellName();
        numDashedLine();
        /*
        Java LinkedHashMap class

        Java LinkedHashMap class is Hashtable and Linked list implementation
        of the Map interface, with predictable iteration order.
        It inherits HashMap class and implements the Map interface.

        Java LinkedHashMap contains values based on the key.
        Java LinkedHashMap contains unique elements.
        Java LinkedHashMap may have one null key and multiple null value.
        Java LinkedHashMap is non synchronized.
        Java LinkedHashMap maintains insertion order.
        The initial default capacity of Java HashMap class is 16 with
        a load factor of 0.75.

        public class LinkedHashMap<K, V> extends HashMap<K, V> implements Map<K, V>
         */

        LinkedHashMap<Integer, String> linkedHashSet = new LinkedHashMap<>();
        linkedHashSet.put(100, "Abc");
        linkedHashSet.put(101, "VV");
        linkedHashSet.put(102, "BB");
        for (Map.Entry m : linkedHashSet.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        /*
        Java LinkedHashMap key-value pair
         */
        n12.tellName();
        dashedLine();
        LinkedHashMap<Integer,String> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put(100, "ABC");
        linkedHashMap1.put(101, "Vv");
        linkedHashMap1.put(102, "Dd");

        System.out.println("Keys: " + linkedHashMap1.keySet());
        System.out.println("Values: " + linkedHashMap1.values());
        System.out.println("Key-Value pairs: " + linkedHashMap1.entrySet());

        /*
        Java LinkedHashMap remove.
         */
        n12.tellName();
        dashedLine();
        Map<Integer, String> map12 = new LinkedHashMap<>();
        map12.put(101, "Abc");
        map12.put(102, "Vx");
        map12.put(103, "F");
        System.out.println("Before: " + map12);
        map12.remove(102);
        System.out.println("After: " + map12);

        n12.tellName();
        dashedLine();
        /*
        Java LinkedHashMap : Book
         */
        Map<Integer, Book> map13 = new LinkedHashMap<>();
        Book b1 = new Book(101, "Java", "Trap","ABC", 8);
        Book b2 = new Book(102, "Java2", "Trap2","ABC2", 4);
        Book b3 = new Book(103, "Java3", "Trap3","ABC3", 6);

        map13.put(2, b2);
        map13.put(1, b1);
        map13.put(3, b3);
        System.out.println("Books:");
        for (Map.Entry <Integer, Book> entry : map13.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + "Details:");
            System.out.println(b.id + " " + b.name + " "
            + b.author + " " + b.publisher + " " + b.getQuantity());
        }

        NamesAll n13 = new NamesAll(nameSixteen);
        n13.tellName();
        numDashedLine();
        /*
        Java TreeMap class

        Java TreeMap class is a red-black tree based implementation. It
        provides an efficient means of storing key-value pairs in
        sorted order.

        The important points about Java TreeMap class are:

        Java TreeMap contains values based on the key. It implements
        the NavigableMap interface and extends AbstractMap class.

        Java TreeMap contains only unique elements.

        Java TreeMap cannot have a null key but can have multiple null values.

        Java TreeMap is non synchronized.

        Java TreeMap maintains ascending order.

        //TreMap class declaration
        public class TreeMap<K, V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, Serializable

         */
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "Abc");
        treeMap.put(102, "R");
        treeMap.put(101, "V");
        treeMap.put(103, "Abc");
        for (Map.Entry m : treeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        n13.tellName();
        dashedLine();
        /*
        Java TreeMap remove():
         */
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(100, "Abc");
        treeMap1.put(102, "Row");
        treeMap1.put(101, "Vv");
        System.out.println("Before:");
        for (Map.Entry m : treeMap1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        treeMap1.remove(102);
        System.out.println("After:");
        for (Map.Entry m : treeMap1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        n13.tellName();
        dashedLine();
        /*
        Java TreeMap : NavigableMap
         */
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(100, "Abc");
        navigableMap.put(102, "R");
        navigableMap.put(101, "W");
        navigableMap.put(103, "AA");
        System.out.println("NavigableMap TreeMap");
        System.out.println("descendingMap:" + navigableMap.descendingMap());
        System.out.println("headMap:" + navigableMap.headMap(102, true));
        System.out.println("tailMap:" + navigableMap.tailMap(102, true));
        System.out.println("subMap:" + navigableMap.subMap(100, false, 102, true));

        n13.tellName();
        dashedLine();
        /*
        Java TreeMap : SortedMap
         */
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(100, "Abc");
        sortedMap.put(102, "Ro");
        sortedMap.put(101, "V");
        sortedMap.put(103, "AD");
        System.out.println("SortedMap TreeSet");
        System.out.println("headMap:" + sortedMap.headMap(102));
        System.out.println("tailMap:" + sortedMap.tailMap(102));
        System.out.println("subMap:" + sortedMap.subMap(100, 102));
        /*
        difference between HashMap and TreeMap
        HashMap                                    TreeMap
        1. HashMap can contain one null key.      TreeMap cannot contain any null key.
        2. HashMap maintains no order.            TreeMap maintains ascending order.
         */

        n13.tellName();
        dashedLine();
        /*
        Java TreeMap : Book
         */
        Map<Integer, Book> treeMap2 = new TreeMap<>();
        Book book4 = new Book(101, "Java","Java","Java", 8);
        Book book5 = new Book(102, "Java2","Java2","Java2", 4);
        Book book6 = new Book(103, "Java3","Java3","Java3", 6);

        treeMap2.put(2, book5);
        treeMap2.put(1, book4);
        treeMap2.put(3, book6);

        for (Map.Entry<Integer, Book> entry : treeMap2.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.author + " " + b.publisher
            + " " + b.getQuantity());
        }
        NamesAll n14 = new NamesAll(getNameSeventeen);
        n14.tellName();
        numDashedLine();
        /*
        Collections Class in Java

        Collections class is a member of the Java Collection Framework.
        The java.util.Collections package is the package that contains
        the Collections class. Collections class is basically used with
        the static methods that operate on the collections or return
        the collection. All the methods of this class throw the NullPointerException
        if the collection or object passed to the methods is null.
         */
        /*
        Adding elements to the Collections: addAll()
         */
        System.out.println("addAll()");
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("Trap");
        Collections.addAll(items, "ABC", "W");
        for (int i = 0; i < items.size(); i++){
            System.out.print(items.get(i) + " ");
        }

        n14.tellName();
        dashedLine();
        /*
        Sorting Collections
         */
        System.out.println("Sorting...");
        List<String> items1 = new ArrayList<>();
        items1.add("F");
        items1.add("ABC");

        Collections.addAll(items1, "F", "W", "D");

        Collections.sort(items1);
        for (int i = 0; i < items1.size(); i++) {
            System.out.print(items1.get(i) + " ");
        }
        System.out.println();

        Collections.sort(items1, Collections.reverseOrder());
        for (int i = 0; i < items1.size(); i++) {
            System.out.print(items1.get(i) + " ");
        }
        n14.tellName();
        dashedLine();
        /*
        Searching in a Collections
        binarySearch() method returns the position of an object in a
        sorted list.
         */
        System.out.println("binarySearch()");
        List<String> items2 = new ArrayList<>();
        items2.add("Horse");
        items2.add("Cat");
        items2.add("Dog");
        items2.add("Java");
        items2.add("Ball");
        items2.add("Toys");
        Collections.sort(items2);
        System.out.println("Horse is " + Collections.binarySearch(items2,"Horse"));
        System.out.println("Apple is " + Collections.binarySearch(items2,"Apple"));

        n14.tellName();
        dashedLine();
        /*
        Copying Elements
        copy() method is used to copy all the elements
        from one list into another. After the operation, the index of each
        copied element in the destination list will be identical to
        its index in the source list. The destination list must be at least
        as long as the source list. If it is longer, the remaining elements
        in the destination list are unaffected.
         */
        System.out.println("copy()");
        List<String> destinationList = new ArrayList<>();
        destinationList.add("WWW");
        destinationList.add("ABC");
        destinationList.add("Dog");
        destinationList.add("Apple");
        System.out.println("destination list is");
        for (int i = 0; i < destinationList.size(); i++) {
            System.out.print(destinationList.get(i) + " ");
        }
        System.out.println();
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Java");
        sourceList.add("Cat");

        Collections.copy(destinationList, sourceList);
        System.out.println("After:");
        for (int i = 0; i < destinationList.size(); i++) {
            System.out.print(destinationList.get(i) + " ");
        }

        n14.tellName();
        dashedLine();
        /*
        Disjoint Collections
        disjoint() is used to check whether two specified collections
        are disjoint or not. More formally, two collections are disjoint
        if they have no are elements in common. It returns true if the
        two collections do not have any element in common.
         */
        System.out.println("disjoint()");
        List<String> listDisjoint = new ArrayList<>();
        listDisjoint.add("SSS");
        listDisjoint.add("ABC");
        listDisjoint.add("Dog");
        listDisjoint.add("Ball");

        List<String> listDisjoint2 = new ArrayList<>();
        listDisjoint2.add("FFF");
        listDisjoint2.add("A");
        listDisjoint2.add("Cat");
        //listDisjoint2.add("Ball");

        System.out.println(Collections.disjoint(listDisjoint,listDisjoint2));

        NamesAll n15 = new NamesAll(getNameEighteen);
        n15.tellName();
        numDashedLine();
        /*
        Arrays class in Java

        The Arrays class in java.util package is a part of the
        Java Collection Framework. This class provides static
        methods to dynamically create and access Java arrays.
        It consists of only static methods and the methods of
        Object class. The methods of this class can be used
        by the class name itself.

        Fill an array with a particular value.
        Sort an Arrays.
        Search in an Arrays.
        And many more.

        public class Arrays extends Object
         */
        int intArr[] = {10, 20, 15, 22, 35};
        System.out.println("Array as List: " + Arrays.asList(intArr));
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        for (int i : intArr) {
            System.out.print(i + " ");
        }


        n15.tellName();
        dashedLine();

        int intArr2[] = {10, 20, 15, 22, 35};
        System.out.println("Sorted");
        Arrays.sort(intArr2);

        int intKey = 20;

        System.out.println("After: " + intKey + " found at index = "
        + Arrays.binarySearch(intArr2, intKey));

        n15.tellName();
        dashedLine();

        int intArr3[] = {10, 20, 15, 22, 35};
        Arrays.sort(intArr3);
        int intKey2 = 22;
        System.out.println("binarySearch: " + intKey2 +
                " found at index = " + Arrays.binarySearch(intArr3, 1, 3, intKey2));

        n15.tellName();
        dashedLine();

        int intArr4[] = {10, 20, 15, 22, 35};
        int intArr5[] = {10, 15, 22};
        //System.out.println("compare: " + Arrays.compare(intArr4, intArr5));
        System.out.println("equals: " + Arrays.equals(intArr4, intArr5));
        //System.out.println("compareUnsigned: " + Arrays.compareUnsigned(intArr4, intArr5));

        n15.tellName();
        dashedLine();

        int intArr6[] = {10, 20, 15, 22, 35};
        for (int i : intArr6) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("copyOf:");
        System.out.print(Arrays.toString(Arrays.copyOf(intArr6, 10)));

        n15.tellName();
        dashedLine();

        int intArr7[] = {10, 20, 15, 22, 35};
        System.out.println("before copyOfRange: " + Arrays.toString(intArr7));
        System.out.println("after copyOfRange: " +
                Arrays.toString(Arrays.copyOfRange(intArr7, 1, 3)));

        n15.tellName();
        dashedLine();

        int intArr8[][] = {{10, 20, 15, 22, 35}};
        int intArr9[][] = {{10, 15, 22}};
        System.out.println("deepEquals: " + Arrays.deepEquals(intArr8, intArr9));

        n15.tellName();
        dashedLine();

        int intArr10[][] = {{10, 20, 15, 22, 35}};
        System.out.println("deepHashCode: " + Arrays.deepHashCode(intArr10));

        n15.tellName();
        dashedLine();

        int intArr11[][] = {{10, 20, 15, 22, 35}};
        System.out.println("deepToString: " + Arrays.deepToString(intArr11));


        int intArr12[] = {10, 20, 15, 22, 35};
        System.out.println("stream: " + Arrays.stream(intArr12));
        System.out.println("spliterator: " + Arrays.spliterator(intArr12, 1, 3));
        System.out.println("hashCode: " + Arrays.hashCode(intArr12));

        n15.tellName();
        dashedLine();

        int intArr13[] = {10, 20, 15, 22, 35};
        Arrays.parallelSort(intArr13);
        System.out.println("parallelSort: ");
        for (int s : intArr13) {
            System.out.print(s + " ");
        }

        n15.tellName();
        dashedLine();

        int intArr14[] = {10, 20, 15, 22, 35};
        int intKey3 = 22;
        Arrays.fill(intArr14, intKey3);
        System.out.println("fill: " + Arrays.toString(intArr14));

//        n15.tellName();
//        dashedLine();
//
//        int intArr15[] = {10, 20, 15, 22, 35};
//        int intArr16[] = {10, 15, 22};
//        System.out.println("mismatch: " + Arrays.mismatch(intArr15, intArr16));

        n15.tellName();
        dashedLine();

        Dog[] arr = { new Dog(1, "Donny", "She"),
                      new Dog(3, "Pon", "He"),
                      new Dog(2, "Ron", "He"),
        };
        System.out.println("Unsorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr, new Dog.SortAge());
        System.out.println("\n Sorted by age");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        timeStartFinish();
    }

    public static void timeStartFinish() {
        LocalTime end = LocalTime.now();
        System.out.println("\n" + "time start is: " +  timeStart + "\n" +
                "time finish is: " + end + "\n" + dashed);
        long dif = Math.abs(end.getNano() - timeStart.getNano());
        System.out.println(Color.MAGENTA_BACKGROUND + "time total is nanoseconds:" +
                Color.RESET + " " + TimeUnit.NANOSECONDS.convert(dif, TimeUnit.NANOSECONDS));
    }

    public static List<String> reverse(ArrayList<String> n) {
        Stack<String> stack4 = new Stack<>();
        while (!n.isEmpty()) {
            stack4.push(n.get(0));
            n.remove(0);
        }
        while (!stack4.isEmpty()) {
            n.add(stack4.pop());
        }
        return n;
    }

    public static void numDashedLine() {
        count++;
        System.out.println(count + ". " + dashed + "\n");
    }

    public static void dashedLine() {
        System.out.println("\n" + dashed + "\n");
    }
}