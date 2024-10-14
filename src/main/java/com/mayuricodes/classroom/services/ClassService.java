package com.mayuricodes.classroom.services;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public Class createClass(Class newClass) {
        return classRepository.save(newClass);
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
