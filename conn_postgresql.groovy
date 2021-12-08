import groovy.sql.Sql

def dbUrl      = "jdbc:postgresql://localhost/postgres"
def dbUser     = "postgres"
def dbPassword = "postgres"
def dbDriver   = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)
   sql.eachRow('SELECT VERSION()'){ row ->println row[0]
      }
sql.close() 
