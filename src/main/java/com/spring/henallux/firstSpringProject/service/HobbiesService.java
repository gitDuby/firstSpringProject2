package com.spring.henallux.firstSpringProject.service;


import java.util.ArrayList;
import com.spring.henallux.firstSpringProject.model.Hobby;
import org.springframework.stereotype.Service;

@Service
public class HobbiesService {
    private ArrayList<Hobby> hobbies;

    public HobbiesService() {
        hobbies = new ArrayList<>();
        hobbies.add(new Hobby("sport","Sport"));
        hobbies.add(new Hobby("music","Music"));
        hobbies.add(new Hobby("drawing","Drawing"));
        hobbies.add(new Hobby("nature","Nature"));
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}