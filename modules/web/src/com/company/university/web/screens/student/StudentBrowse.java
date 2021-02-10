package com.company.university.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.university.entity.Student;

@UiController("university_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}