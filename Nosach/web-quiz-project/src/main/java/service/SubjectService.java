package service;

import dao.SubjectDAO;
import dao.SubjectDAOImpl;
import entity.Subject;

import java.util.List;

public class SubjectService {

    SubjectDAO sd = new SubjectDAOImpl();

    public int addSubject(Subject subject) {
        return sd.addSubject(subject);
    }

    public Subject getSubject(int id) {
        return sd.getSubject(id);
    }

    public List<Subject> getAllSubjects() {
        return sd.getAllSubjects();
    }

    public int getIdByName(String subj) {
        return sd.getIdByName(subj);
    }
}
