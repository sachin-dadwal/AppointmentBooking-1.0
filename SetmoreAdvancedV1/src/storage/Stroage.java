package storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import doctor.Doctor;

public class Stroage {
	
	public static Map<String ,Doctor> mapofDoctors= new HashMap();
	public static void main(String[] args) {
		Set<Entry<String, Doctor>> s=mapofDoctors.entrySet();
		
	}

}
