# FSAD Exam - Maven Hibernate Project

## Project Details
- **Package**: com.klef.fsad.exam
- **Database**: fsadexam
- **Entity**: Course (ID, Name, Description, Date, Status)

## Setup Instructions

1. Create MySQL database:
```sql
CREATE DATABASE fsadexam;
```

2. Update database credentials in `src/main/resources/hibernate.cfg.xml` if needed

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn exec:java -Dexec.mainClass="com.klef.fsad.exam.ClientDemo"
```

## Operations Implemented
- Insert a new Course record
- View Course record by ID
