package com.sumith.labwork_Programs_oct18;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class HospitalService {

	
	static int i=100;
	List<Hospital> det=new ArrayList<>();
	
	public ArrayList<Hospital>  addHospital(Hospital h)
	{
		
		h.setHospitalCode(i);
		det.add(h);
		i++;
		return (ArrayList<Hospital>) det;
		
	   
	}

	public Map<Integer,String> getHospitals()
	{
		
		Map <Integer,String> mt=new HashMap<>();
		for(int i=0;i<det.size();i++) {
		mt.put(det.get(i).getHospitalCode(), det.get(i).getHospitalName());
		}
		
		return mt;
		
	}
	
	public Hospital getHospitalDetails(int code)
	{
		Hospital hs=null;
		for(int i=0;i<det.size();i++) {
			if(det.get(i).getHospitalCode()==code) {
				hs=det.get(i);
			}
			}
		
		return hs;
	}
	
	
}
