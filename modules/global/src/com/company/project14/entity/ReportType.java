package com.company.project14.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT14_REPORT_TYPE")
@Entity(name = "project14_ReportType")
@NamePattern("%s|reportTypeName")
public class ReportType extends StandardEntity {
    private static final long serialVersionUID = -4094456105465465799L;

    @NotNull
    @Column(name = "REPORT_TYPE_NAME", nullable = false, unique = true)
    private String reportTypeName;

    public String getReportTypeName() {
        return reportTypeName;
    }

    public void setReportTypeName(String reportTypeName) {
        this.reportTypeName = reportTypeName;
    }
}