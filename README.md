# flyway-h2-poc
Poc for flyway with spring boot and h2 database


https://flywaydb.org/

Flyway is used for data migration. Steps to use it:

1. Include the flyway dependency in POM
2. Flyway will look for migration scripts under /resources/db/migration folder (or as specified in application.properties)
3. Atleast one dummy migration script is a must for Flyway to work
4. When connected with relational DB, all the migration scripts are maintained in schema_version table


To enable H2 Db console:
H2 Database console: https://dzone.com/articles/using-the-h2-database-console-in-spring-boot-with


