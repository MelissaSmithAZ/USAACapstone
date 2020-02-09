-- members

INSERT INTO members(member_name,member_number,phone,address,email,auto_1,base_state,bi_coverage,collision_coverage, pd_coverage) VALUES
('Billy Joel', 2637463,'123-456-7890','1 Happy St, Phoenix AZ 89999','WeDidStartedTheFire@Joel.com', '2020 Toyota Camry', 'CA',100000,500,50000),
('Martha Stuart', 263999,'999-999-999','1 Sunny St, Phoenix AZ 89999','ItsAGoodThing@Martha.com', '2020 Toyota Highlander', 'AZ',200000,1000,100000),
('Jane Doe', 111222,'111-222-3333','1 Main St, Phoenix AZ 89999','JaneDoe@google.com', '2020 Chrysler 300', 'CA',1000000,500,50000),
('Dean Martin', 8887765,'888-456-7890','100 29th St, Phoenix AZ 89999','Cool@yahoo.com', '2020 Jaguar F-Type', 'AZ',500000,2000,50000),
('Kim Maret', 66677788,'777-888-7890','70 Happy St, Phoenix AZ 89999','kimMaret@google.com', '2020 Subaru Crosstrek', 'CA',1000000,500,500000);

--Claim
INSERT INTO claim(claimant_name,claimant_phone,claimant_address,claimant_email,claimant_auto,occurrence_state) VALUES
('Jack Black','987-989-9898','90 Golf Rd, Phoenix AZ 99999', 'Golf@golf.com', '1999 VW Bug', 'AZ' ),
('Big O Notation','876-987-0000','O nth st, San Diego CA 99999', 'BigO@gmail.com', '2000 Toyota Camry', 'CA' ),
('Hanna Smith','999-000-1234','45 Easy Rd, Phoenix AZ 99999', 'Easy@gmail.com', '2019 Toyota Tacoma', 'AZ' ),
('Tabby Jones','789-222-9876','100 10th Rd, LA CA 99999', 'TabbyCat@cat.com', '2020 Chrysler 200', 'CA' ),
('Luna Moon','333-777-9898','1/2 Moon  Rd, San Diego CA 99999', 'FullMoon@yahoo.com', '1999 VW Golf GTI Rabbit', 'CA' );

--CoverageCheckList
INSERT INTO coverage_check_list(carNotOnPolicy,ror,transportation,limits,claim_id) VALUES
(true, null,null,true,1),
(null,null,true,null,2),
(true,null,null,null,3),
(null,null,true,true,4),
(null,null,null,true,5);
