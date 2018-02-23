package Class170218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class secreteSanta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<employee> employeeList = new ArrayList<>();
		List<employee> duplicateEmployeeList = new ArrayList<>();
		HashMap<Integer, List<employee>> employeePairMap = new HashMap<Integer, List<employee>>();
		int pairIndex = 0;

		employeeList.add(new employee(100, 25, "Abhi"));
		employeeList.add(new employee(101, 25, "Avi"));
		employeeList.add(new employee(102, 25, "Anu"));
		employeeList.add(new employee(103, 25, "Ash"));
		employeeList.add(new employee(104, 25, "Moni"));
		employeeList.add(new employee(105, 25, "Swty"));
		employeeList.add(new employee(106, 25, "chiw"));
		employeeList.add(new employee(107, 25, "B2"));
		duplicateEmployeeList.addAll(employeeList);

		while (employeeList.size() > 0 && duplicateEmployeeList.size() > 0) {
			List<employee> empPair = new ArrayList<>();
			int firstIndex = new Double(Math.random() * employeeList.size()).intValue();
			int secondIndex = new Double(Math.random() * duplicateEmployeeList.size()).intValue();
			if (!employeeList.get(firstIndex).name.equals(duplicateEmployeeList.get(secondIndex).name)) {
				empPair.add(employeeList.get(firstIndex));
				empPair.add(duplicateEmployeeList.get(secondIndex));
				employeeList.remove(firstIndex);
				duplicateEmployeeList.remove(secondIndex);
				employeePairMap.put(pairIndex++, empPair);
			}
		}

		for (Entry<Integer, List<employee>> entrySet : employeePairMap.entrySet()) {
			System.out.print("Pair NO:" + entrySet.getKey());
			System.out.println("---->" + entrySet.getValue().get(0).name + "&" + entrySet.getValue().get(1).name);
		}
	}

}

class employee {
	int empID, age;
	String name;

	employee(int empID, int age, String name) {
		this.empID = empID;
		this.age = age;
		this.name = name;
	}
}