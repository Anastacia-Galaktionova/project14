package com.company.project14.web.screens.report;

import com.haulmont.cuba.gui.screen.*;
import com.company.project14.entity.Report;

@UiController("project14_Report.edit")
@UiDescriptor("report-edit.xml")
@EditedEntityContainer("reportDc")
@LoadDataBeforeShow
public class ReportEdit extends StandardEditor<Report> {
}