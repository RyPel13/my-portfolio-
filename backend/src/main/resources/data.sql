-- Developer
INSERT INTO DEVELOPER (name, email, linked_in, git_hub, resume_link, introduction) 
VALUES ('Ryan Pelto', 'ryanpelto13@gmail.com', 
        'https://www.linkedin.com/in/ryan-pelto-48a6341a1/', 
        'https://github.com/RyPel13', 
        'https://drive.google.com/file/d/15SncLhotIlNiiBhKCCRkQdxcOjifFUe0/view',
        'I am an information technology student passionate about software development and data structures.');

-- Projects
INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Personal Fitness Application', 'Built a full personal fitness planning application in Java featuring a deep, multi-level class hierarchy.', 
        'https://github.com/RyPel13/Personal-Fitness-Application', 'Java', 'Java Application', 1);
        
INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Video Rental System', 'Designed and implemented a multi-class video rental system in Java, modeling real-world rental operations for DVDs, Blu-rays, and video games using core OOP principles.', 
        'https://github.com/RyPel13/Video-Rental-System', 'Java', 'Java Application', 1);
        
INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Generic Linked Chain Application', 'Implemented a custom generic linked data structure (Node) in Java as a dynamic, type-safe alternative to fixed-size arrays, compatible with any reference type determined at runtime.', 
        'https://github.com/RyPel13/Generic-Linked-Chain-', 'Java', 'Java Application', 1);

INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Iterable Iterable System', 'Implemented the Java Iterator and Iterable interfaces from scratch to create two custom iteration utilities.', 
        'https://github.com/RyPel13/Iterable_Iterator_System', 'Java', 'Java Application', 1);

INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Portfolio Backend', 'A Spring Boot REST API serving portfolio data from an H2 database.', 
        'https://github.com/RyPel13/my-portfolio-backend', 'Java', 'Web Development', 1);

INSERT INTO PROJECT (title, description, github_link, language, category, developer_id)
VALUES ('Portfolio Frontend', 'A React application displaying personal portfolio data.', 
        'https://github.com/RyPel13/my-portfolio-frontend', 'JavaScript', 'Web Development', 1);
        
-- Interests
INSERT INTO INTEREST (title, summary, category)
VALUES ('Software Development', 'Passionate about building clean and efficient applications.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('Data Structures', 'Enjoy studying algorithms and optimizing code performance.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('PL/SQL Development', 'Passionate about writing SQL queries and connecting the database to information systems.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('Database Administrator', 'Passionate about managing the infrastures of a Database Managment System.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('Data Analysis', 'I am interested in analyzing how data is store and how data solves business needs.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('Quality Assurance Tester', 'I enjoy reviewing requirements, fucntional specifications, testing data/endpoints via test scripts, and API testing via Postman.', 'Technology');

INSERT INTO INTEREST (title, summary, category)
VALUES ('Business Requirements Gathering', 'Passionate about understanding a business and developing requirements that will answer there business needs.', 'Technology');

-- Developer Interests (links developer to interest)
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 1);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 2);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 3);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 4);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 5);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 6);
INSERT INTO DEVELOPER_INTERESTS (developer_id, interest_id) VALUES (1, 7);

-- Goals
INSERT INTO GOAL (title, summary, timeline, achieved, developer_id)
VALUES ('Land First Developer Job', 'Secure a full time software development position.', 'August 2026', false, 1);

INSERT INTO GOAL (title, summary, timeline, achieved, developer_id)
VALUES ('Complete Portfolio', 'Build and deploy a full stack personal portfolio.', 'June 2026', false, 1);

INSERT INTO GOAL (title, summary, timeline, achieved, developer_id)
VALUES ('Information Systems Design and Database Concepts', 'Designed a 3NF-normalized relational database and built a data warehouse for a hotel system.', 'December 2025', true, 1);

INSERT INTO GOAL (title, summary, timeline, achieved, developer_id)
VALUES ('Java Object-Oriented Programming', 'Built and implemented many different java applications.', 'May 2026', false, 1);