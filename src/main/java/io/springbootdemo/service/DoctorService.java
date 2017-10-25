package io.springbootdemo.service;

import io.springbootdemo.bean.Doctor;
import io.springbootdemo.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang on 25/10/2017.
 */
@Service
public class DoctorService {

    private final DoctorMapper doctorMapper;


    public DoctorService(DoctorMapper doctorMapper) {
        this.doctorMapper = doctorMapper;
    }

    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = doctorMapper.findAll();

        return doctors;
    }

    public Doctor getDoctorById(int id) {
        Doctor doctor = doctorMapper.findDoctorById(id);

        return doctor;
    }

    public void insertDoctor(Doctor doctor) {
        doctorMapper.insertDoctor(doctor);
    }
}
