alter table PPP_FIRST add constraint FK_PPP_FIRST_ON_CAT foreign key (CAT_ID) references PPP_TWO(ID);
create index IDX_PPP_FIRST_ON_CAT on PPP_FIRST (CAT_ID);
