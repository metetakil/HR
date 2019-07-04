insert into employee(id, tcno, first_name, last_name, birth_date, version) values(7, '19315957022', 'Mete', 'Takil', '1979-08-22', null);

insert into project(id, project_name, budget) values(3, 'Some project', 450000);

insert into employee_project(employee_id, project_id) values(7, 3);