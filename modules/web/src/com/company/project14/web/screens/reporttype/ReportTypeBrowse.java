package com.company.project14.web.screens.reporttype;

import com.haulmont.cuba.gui.screen.*;
import com.company.project14.entity.ReportType;

@UiController("project14_ReportType.browse")
@UiDescriptor("report-type-browse.xml")
@LookupComponent("reportTypesTable")
@LoadDataBeforeShow
public class ReportTypeBrowse extends StandardLookup<ReportType> {
}