# Use an official Python image as the base image
FROM python:3.8-slim

# Install the psycopg2 library for Python
RUN pip install psycopg2-binary

# Copy the script into the container
COPY ./scripts/init.py /create_databases.py

# Set environment variables for database connection
ENV DB_HOST postgres
ENV DB_PORT 5432
ENV DB_USER admin
ENV DB_PASSWORD root

# Run the Python script to create databases
CMD ["python", "/create_databases.py"]
