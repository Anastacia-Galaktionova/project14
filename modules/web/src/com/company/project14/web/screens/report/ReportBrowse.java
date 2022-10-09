package com.company.project14.web.screens.report;

import com.haulmont.cuba.gui.screen.*;
import com.company.project14.entity.Report;

@UiController("project14_Report.browse")
@UiDescriptor("report-browse.xml")
@LookupComponent("reportsTable")
@LoadDataBeforeShow
public class ReportBrowse extends StandardLookup<Report> {
}