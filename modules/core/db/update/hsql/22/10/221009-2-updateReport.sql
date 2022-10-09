alter table PROJECT14_REPORT alter column REPORT_TYPE rename to REPORT_TYPE__U74826 ^
alter table PROJECT14_REPORT alter column REPORT_TYPE__U74826 set null ;
alter table PROJECT14_REPORT add column REPORT_TYPE_ID varchar(36) ;
