-- begin PROJECT14_REPORT
alter table PROJECT14_REPORT add constraint FK_PROJECT14_REPORT_ON_REPORT_TYPE foreign key (REPORT_TYPE_ID) references PROJECT14_REPORT_TYPE(ID)^
create unique index IDX_PROJECT14_REPORT_UNIQ_REPORT_NAME on PROJECT14_REPORT (REPORT_NAME)^
create index IDX_PROJECT14_REPORT_ON_REPORT_TYPE on PROJECT14_REPORT (REPORT_TYPE_ID)^
-- end PROJECT14_REPORT
-- begin PROJECT14_REPORT_TYPE
create unique index IDX_PROJECT14_REPORT_TYPE_UNIQ_REPORT_TYPE_NAME on PROJECT14_REPORT_TYPE (REPORT_TYPE_NAME)^
-- end PROJECT14_REPORT_TYPE
