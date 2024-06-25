import java.util.Arrays;
import java.util.Scanner;

import HashTable.CustomerDetails;

public class Main {
    public static void main(String[] args) {
//
//        AddArray addArray = new AddArray();
//
//        addArray.addTempDays(0, 2);
//        addArray.addTempDays(1, 6);
//
//        addArray.findTempDays(0);
//        addArray.findTempDays(1);
//        addArray.findTempDays(3);
//
//        Scanner scanner = new Scanner(System.in);
//
//        int days =scanner.nextInt();
//
//        addArray.findTempDays(days);
        
//        DeclareVariable declare = new DeclareVariable();
//        declare.findMe();
//        
//        Exercise2 exercise = new Exercise2();

    	//Iteration iteration = new Iteration();
//    	WhileLoop whileLoop = new WhileLoop();

//    	doWhileLoop doWhile = new doWhileLoop();
  	//ContinueStatement cont = new ContinueStatement();
//    InterestRate interest = new InterestRate(); 
    	
//    	CountingFigures counting = new CountingFigures();
//    	counting.Count();
    	
    //	int [] a = {3, 41, 52, 26, 38, 57, 9, 49};
    	//InsertionSorting insertionSorting = new InsertionSorting(a);
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.Merge(a);
//       // System.out.println("hello world");
    	
//    	StackData stack = new StackData(5);
//    	stack.Push(3);
//    	stack.Push(10);
//    	stack.Push(11);
//    	
//    	System.out.println(stack.pop());
//    	stack.Push(19);
    	
    	
//    	Queue queue = new Queue(10);
//    	
//    	queue.enqueue("love");
//    	queue.enqueue("hate");
//    	queue.enqueue("pain");
//    	
//    	queue.dequeue();
//    	queue.enqueue("Noway");
//    	queue.enqueue("Mamba");
//    	queue.dequeue();
//    	queue.dequeue();
//    	
//    	queue.show();
//    	
//    	Linked linked = new Linked();
    	
    	int [] a = {31, 41, 59, 26, 41, 58};
    	int [] b = {9, 9, 1, 4, 9, 2};


    	//DescendingSort sort = new DescendingSort(a);
    	
    //	AddArrays add = new AddArrays (a, b);
//    	
//    	int p = 0;
//    	int r = a.length -1;
    	
//    	QuickSort quicksort = new QuickSort();
//    	quicksort.Sort(a, p, r); 
//    	
       	//System.out.println(Arrays.toString(a));
       //	quicksort.printArray(a);
    	
//    	RecursionPractice practice = new RecursionPractice();
//    	practice.Precious(10);
    	
//    	Linked linked = new Linked();
//    	linked.insert(10);
//    	linked.insert(5);
//    	linked.insert(3);
//    	linked.insert(2);
//    	linked.insert(9);
//    	
//    	linked.Search(9);
     	HashTable hash = new HashTable();
     	  HashTable.CustomerDetails customer1 = new HashTable.CustomerDetails("John", "Doe", "1234567890", 50, "Laptop", "Young");
     	 HashTable.CustomerDetails  customer2 = new HashTable.CustomerDetails ("Jane", "May", "0987654321", 20, "Iphone", "Josh"); 
     	  HashTable.CustomerDetails customer3 = new HashTable.CustomerDetails("Lucy", "Lala", "1234567890", 30, "Iphone", "Josh");
      	 HashTable.CustomerDetails  customer4 = new HashTable.CustomerDetails ("Jack", "Poo", "0987654321", 35, "Samsung", "Peter");   
      	HashTable.CustomerDetails customer5 = new HashTable.CustomerDetails("Larry", "Lala", "1234567890", 45, "Desktop", "Peter");
     	 HashTable.CustomerDetails  customer6 = new HashTable.CustomerDetails ("Bark", "Poo", "0987654321", 70, "Iphone, Laptop", "Peter"); 
     	  hash.put(1, customer1);
          hash.put(2, customer2);
          hash.put(3, customer3);
          hash.put(4, customer4);
          hash.put(5, customer5);
          hash.put(6, customer6);
          
          System.out.println("Customer with key 1: " + hash.get(1)); // Should print John
          System.out.println("Customer with key 2: " + hash.get(2)); // Should print Jane
    	
          HashTable.Seller seller1 = new HashTable.Seller("Young", "Product Manager");
          HashTable.Seller seller2 = new HashTable.Seller("Peter", "Sales Manager");
          HashTable.Seller seller3 = new HashTable.Seller("Josh", "Product Manager");
          HashTable.Seller seller4 = new HashTable.Seller("Steven", "Sales Manager");
          
          hash.putSeller(1, seller1);
          hash.putSeller(2, seller2);
          hash.putSeller(3, seller3);
          hash.putSeller(4, seller4);
          System.out.println(hash.getSeller(1));
          
          hash.CustomerAllocation("Young");
          hash.CustomerAllocation("Steven");
          hash.CustomerAllocation("Peter");
          hash.CustomerAllocation("Josh");
          
          HashTable.Products product1 = new HashTable.Products("Iphone", 20);
          HashTable.Products product2 = new HashTable.Products("Iphone Painting", 30);
          HashTable.Products product3 = new HashTable.Products("Samsung", 35);
          HashTable.Products product4 = new HashTable.Products("Laptop", 50);
          HashTable.Products product5 = new HashTable.Products("Desktop", 45);
          
          hash.putProduct(1, product1);
          hash.putProduct(2, product2);
          hash.putProduct(3, product3);
          
          System.out.println(hash.getProduct(3));
          
          System.out.println(hash.getHashLength());

          hash.HeapSort();
          //hash.QuickSort(hash.getTable(), 0 , hash.getTable().length -1);
          
          hash.alphaHeapSort();
          hash.AlphaInsertion(hash.getTable());
          
          BinarySearch tree = new BinarySearch();
          
          System.out.println();
          tree.root = new Node(15);
          tree.root.left = new Node (10);
          tree.root.left.right = new Node(11);
          tree.root.right = new Node(20);
          tree.root.left.left = new Node (9);
          
          
          tree.inorderTraversal(tree.root);
          
          System.out.println(tree.Tree_Search(tree.root, 10).data);
          System.out.println(tree.Tree_Mininum(tree.root));
          
          hash.CostofService("Iphone", hash.getTable());
          hash.HighestServiceCost(hash.getTable());
          hash.LowestServiceCost(hash.getTable());
    
          System.out.print(" Enter the stylist's name: " );
      	Scanner s = new Scanner(System.in);
      	String sylist =s.next();
      	hash. userInput(sylist, hash.getTable());
    }
}