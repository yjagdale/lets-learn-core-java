package Abhi_Matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecretSantaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, List<employee>> empMap = new HashMap<Integer, List<employee>>();
		List<employee> emplist = new ArrayList<>();
		emplist.add(new employee("Abhi"));
		emplist.add(new employee("Abhi6"));
		emplist.add(new employee("Abhi1"));
		emplist.add(new employee("Abhi2"));
		emplist.add(new employee("Abhi3"));
		emplist.add(new employee("Abhi4"));
		emplist.add(new employee("Abhi5"));

		List<employee> duplist = new ArrayList<>();
		duplist.addAll(emplist);
		int z = 0;

		while (emplist.size() > 0 && duplist.size() > 0) {

			int a = new Double(Math.random() * emplist.size()).intValue();
			int b = new Double(Math.random() * duplist.size()).intValue();

			if (!emplist.get(a).name.equals(duplist.get(b).name)) {

				List<employee> empPair = new ArrayList<>();
				empPair.add(emplist.get(a));
				empPair.add(duplist.get(b));

				emplist.remove(a);
				duplist.remove(b);

				empMap.put(z++, empPair);

			}
		}

		for (Entry<Integer, List<employee>> em : empMap.entrySet()) {
			System.out.println(em.getKey() + ":" + em.getValue().get(0).name + "->" + em.getValue().get(1).name);
		}

	}

}

class employee {
	String name;

	employee(String name) {
		this.name = name;
	}

}