import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Integer
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(10);
		priorityQueue.add(30);
		priorityQueue.add(5);
		priorityQueue.add(20);			
		
		//priorityQueue.poll();
		Object [] arr = priorityQueue.toArray();
		Arrays.sort(arr);
		//Iterator<Integer> itr = priorityQueue.iterator();
		for(Object el : arr){
			System.out.println(el);
		}
		
		
		//2. Employee
		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<Employee>(15, new SalaryComparator());
		employeePriorityQueue.add(new Employee("Rani", "Lead Developer", 50000));
		employeePriorityQueue.add(new Employee("Arshi", "Assistant Manager", 21000));
		employeePriorityQueue.add(new Employee("Akriti", "Telecaller", 16000));
		employeePriorityQueue.add(new Employee("Akshit", "Lead Developer", 60000));
		

		Arrays.sort(employeePriorityQueue.toArray());
		
		Iterator<Employee> employeeIterator = employeePriorityQueue.iterator();
		while(employeeIterator.hasNext()){
			System.out.println(employeeIterator.next());
		}
	}

}

class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary()){
			return 1;
		}else if(o1.getSalary() < o2.getSalary()){
			return -1;
		}else{
			return 0;
		}
	}
}
