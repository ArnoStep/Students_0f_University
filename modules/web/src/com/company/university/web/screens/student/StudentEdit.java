package com.company.university.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.university.entity.Student;

@UiController("university_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}