import groovy.sql.Sql

def dbUrl      = "jdbc:postgresql://localhost/test-db"
def dbUser     = "test"
def dbPassword = "test"
def dbDriver   = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)
