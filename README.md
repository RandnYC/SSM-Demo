# SSM-Demo
Just a simple SSM template

## Requirement
- Mysql ([config file](src/main/resources/config/mybatis/jdbc.properties))
- Maven

## Preparation

&ensp; Initialize the demo database

```mysql
create database SSM_Demo;
use SSM_Demo;

create table User (
    id int primary key auto_increment,
    age int,
    name varchar(11),
    address varchar(11)
);

insert into User values(1, 19, 'foo', 'AAA');
insert into User values(2, 22, 'bar', 'BBB');
insert into User values(3, 20, 'baz', 'CCC');
```
