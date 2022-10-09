package com.company.project14.web.screens.reporttype;

import com.haulmont.cuba.gui.screen.*;
import com.company.project14.entity.ReportType;

@UiController("project14_ReportType.edit")
@UiDescriptor("report-type-edit.xml")
@EditedEntityContainer("reportTypeDc")
@LoadDataBeforeShow
public class ReportTypeEdit extends StandardEditor<ReportType> {
}