package io.springbootdemo.mapper;

import io.springbootdemo.bean.Doctor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.print.Doc;
import java.util.List;

/**
 * Created by yang on 25/10/2017.
 */
@Mapper
public interface DoctorMapper {

    @Select("select * from DOCTOR")
    public List<Doctor> findAll();

    @Select("select * from DOCTOR where id = #{id}")
    public Doctor findDoctorById(int id);

    @Insert("insert DOCTOR (name, birthday, gender, professional) values (#{name}, #{birthday}, #{gender}, #{professional})")
    public void insertDoctor(Doctor doctor);
}
