package io.springbootdemo.controller;

import io.springbootdemo.bean.Doctor;
import io.springbootdemo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yang on 25/10/2017.
 */
@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Doctor> getall() {
        return doctorService.getAllDoctors();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public @ResponseBody Doctor getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String addDoctor(@RequestBody Doctor doctor) {
        doctorService.insertDoctor(doctor);
        return "true";
    }
}
