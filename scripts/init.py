import psycopg2
from psycopg2 import sql
from psycopg2.extensions import ISOLATION_LEVEL_AUTOCOMMIT

# Replace these variables with your actual database connection details
db_host = "postgres"
db_port = "5432"
db_user = "admin"
db_password = "root"

# Connect to the default database
conn = psycopg2.connect(
    host=db_host,
    port=db_port,
    user=db_user,
    password=db_password
)

# Set isolation level to autocommit to create new databases
conn.set_isolation_level(ISOLATION_LEVEL_AUTOCOMMIT)

# Create a cursor object
cursor = conn.cursor()

# Create the customer database
customer_db_name = "customer"
cursor.execute(sql.SQL("CREATE DATABASE {}").format(sql.Identifier(customer_db_name)))

# Create the fraud database
fraud_db_name = "fraud"
cursor.execute(sql.SQL("CREATE DATABASE {}").format(sql.Identifier(fraud_db_name)))

# Create the notification database
notification_db_name = "notification"
cursor.execute(sql.SQL("CREATE DATABASE {}").format(sql.Identifier(notification_db_name)))

# Close the cursor and connection
cursor.close()
conn.close()

print("Databases created successfully.")
