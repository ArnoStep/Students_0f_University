package com.company.university.web.screens.group;

import com.haulmont.cuba.gui.screen.*;
import com.company.university.entity.Group;

@UiController("university_Group.browse")
@UiDescriptor("group-browse.xml")
@LookupComponent("groupsTable")
@LoadDataBeforeShow
public class GroupBrowse extends StandardLookup<Group> {
}