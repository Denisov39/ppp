alter table PPP_FIRST alter column CATEGORY_ID rename to CATEGORY_ID__U74209 ^
drop index IDX_PPP_FIRST_ON_CATEGORY ;
alter table PPP_FIRST drop constraint FK_PPP_FIRST_ON_CATEGORY ;
alter table PPP_FIRST add column CAT_ID varchar(36) ;
