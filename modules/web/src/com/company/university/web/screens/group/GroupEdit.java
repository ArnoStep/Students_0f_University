package com.company.university.web.screens.group;

import com.haulmont.cuba.gui.screen.*;
import com.company.university.entity.Group;

@UiController("university_Group.edit")
@UiDescriptor("group-edit.xml")
@EditedEntityContainer("groupDc")
@LoadDataBeforeShow
public class GroupEdit extends StandardEditor<Group> {
}