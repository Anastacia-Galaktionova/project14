package com.company.project14.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
//comm for testing issue
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT14_REPORT")
@Entity(name = "project14_Report")
@NamePattern("%s|reportName")
public class Report extends StandardEntity {
    private static final long serialVersionUID = 4414009864813950226L;

    @NotNull
    @Column(name = "REPORT_NAME", nullable = false, unique = true)
    private String reportName;

    @JoinColumn(name = "REPORT_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportType reportType;

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }
}
