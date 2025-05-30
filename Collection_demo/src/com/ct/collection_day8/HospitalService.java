package com.ct.collection_day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HospitalService {
    private List<Hospital> hospitalList = new ArrayList<>();

    public int addHospital(String hospitalName, List<String> listOfTreatments, 
                           String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
        hospitalList.add(hospital);
        return hospital.getHospitalCode();
    }

    public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<>();
        for (Hospital hospital : hospitalList) {
            hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
    }

    public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hospital : hospitalList) {
            if (hospital.getHospitalCode() == hospitalCode) {
                return hospital;
            }
        }
        return null;
    }
}
