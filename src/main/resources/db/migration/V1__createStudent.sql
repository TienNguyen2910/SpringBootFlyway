drop table if exists student ;

create table student(
    mssv varchar(10) not null primary key,
    hoten varchar(50) not null,
    ngaythangsinh date
);
