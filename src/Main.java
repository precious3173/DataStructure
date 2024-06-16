import java.util.Arrays;
import java.util.Scanner;

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
    	
    	int p = 0;
    	int r = a.length -1;
    	
    	QuickSort quicksort = new QuickSort();
    	quicksort.Sort(a, p, r); 
    	
       	//System.out.println(Arrays.toString(a));
       	quicksort.printArray(a);
    	
//    	RecursionPractice practice = new RecursionPractice();
//    	practice.Precious(10);
    }
}