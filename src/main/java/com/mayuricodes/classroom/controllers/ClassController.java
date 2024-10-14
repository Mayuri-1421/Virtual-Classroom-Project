package com.mayuricodes.classroom.controllers;

@RestController
@RequestMapping("/api/classes")

public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping
    public ResponseEntity<Class> createClass(@RequestBody Class newClass) {
        return ResponseEntity.ok(classService.createClass(newClass));
    }

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Class> getClassById(@PathVariable Long id) {
        return classService.getClassById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
