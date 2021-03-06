-- members

INSERT INTO members(member_name,member_number,phone,address,email,auto_1,base_state,bi_coverage,collision_coverage, pd_coverage) VALUES
('Billy Joel', 2637463,'123-456-7890','1 Happy St, Phoenix AZ 89999','WeDidStartedTheFire@Joel.com', '2020 Toyota Camry', 'CA',100000,500,50000),
('Martha Stuart', 263999,'999-999-999','1 Sunny St, Phoenix AZ 89999','ItsAGoodThing@Martha.com', '2020 Toyota Highlander', 'AZ',200000,1000,100000),
('Jane Doe', 111222,'111-222-3333','1 Main St, Phoenix AZ 89999','JaneDoe@google.com', '2020 Chrysler 300', 'CA',1000000,500,50000),
('Dean Martin', 8887765,'888-456-7890','100 29th St, Phoenix AZ 89999','Cool@yahoo.com', '2020 Jaguar F-Type', 'AZ',500000,2000,50000),
('Jim Morgan', 2227765,'111-456-7890','5151 29th St, Phoenix AZ 89999','yep@yahoo.com', '2020 Jaguar F-Type', 'AZ',500000,2000,50000),
('Kim Maret', 66677788,'777-888-7890','70 Happy St, Phoenix AZ 89999','kimMaret@google.com', '2020 Subaru Crosstrek', 'CA',1000000,500,500000);



--CoverageCheckList
--INSERT INTO coverage_check_list(car_not_on_policy,limits,ror,transportation ) VALUES
--(true, false,false,false),
--(false,false,false,true),
--(true,false,false,false),
--(false,false,false,true),
--(true,false,false,false),
--(true,false,false,true);




--Employees
INSERT INTO employees(employee_name,employee_number ) VALUES
('Susan Park', 5),
('Billy Johnson', 20),
('Karen Smith', 34);

--Managers
INSERT INTO managers(manager_number ,manager_name ) VALUES
(22,'Susan Park'),
(45,'Billy Johnson'),
(12, 'Karen Smith');

--Claim
INSERT INTO claim(claim_number,claimant_name,claimant_phone,claimant_address,claimant_email,claimant_auto,occurrence_state, employee_id,member_id  ) VALUES
(23284,'Jack Black','987-989-9898','90 Golf Rd, Phoenix AZ 99999', 'Golf@golf.com', '1999 VW Bug', 'AZ', 1,  1),
(78996,'Big O Notation','876-987-0000','O nth st, San Diego CA 99999', 'BigO@gmail.com', '2000 Toyota Camry', 'CA' ,2, 2),
(25648,'Hanna Smith','999-000-1234','45 Easy Rd, Phoenix AZ 99999', 'Easy@gmail.com', '2019 Toyota Tacoma', 'AZ',3, 3 ),
(73564,'Tabby Jones','789-222-9876','100 10th Rd, LA CA 99999', 'TabbyCat@cat.com', '2020 Chrysler 200', 'CA', 1, 4),
(44556,'Sabrina Baxter','777-777-7777','777 Star Circle, San Diego CA 44444', 'SabrinaStar@yahoo.com', '2020 Toyota Camry', 'CA',2, 5),
(77765,'Luna Moon','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 1 ),
(79909,'Jim Morison','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 5 ),
(98989,'Jimmy Jones','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 3 ),
(78983,'Bob Dillon','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 1 ),
(34567,'Susan Brown','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 2),
(12345,'Gavin Park','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 4 ),
(33333,'Jill Jones','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 5 ),
(77777,'Clara Bell','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 6 ),
(88776,'Jack Frost','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA',3, 1 );
--TransportationCheckList
INSERT INTO transportation_check_list(call,call_doc,claimant_call,claimant_call_doc, claimant_letter ,coverage_decision,letter, claim_id) VALUES
(true,'test',false,'test',false ,null, false,1),
(false,null, true,null, false ,null, false,2),
(true, null,false, null,false ,null, false,3);

--(false,null, false,null, false, false),
--(false, null,false,null, false, false),
--(false,null, false,null, false, false);

--CarNotOnPolicyCheckList
INSERT INTO car_not_on_policy_check_list(call_doc,call_member,claimant_call, claimant_call_doc,claimant_letter , coverage_decision,final_letter_member, rental_agreement, claim_id ) VALUES
('test',true, false, 'test',false ,null, false, false,6),
('test',false, true,null, false , null, false, false,4),
('test',true, false, null,false ,null, false, false,5);