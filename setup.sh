rm -rf mysql-connector-j_8.2.0-1ubuntu22.04_all.deb
 
# Download the mysql-jdbc connector
wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.2.0-1ubuntu22.04_all.deb
 
# Install it. It will be instaled in /usr/share/java/mysql-connector-java-8.2.0.jar
sudo dpkg -i mysql-connector-j-8.2.0-1ubuntu22.04_all.deb
 
# Remove the downloaded setup file
rm -rf mysql-connector-j_8.2.0-1ubuntu22.04_all.deb
 
# Config
JDBC URL = jdbc:mysql://127.0.0.1:3306
Driver path = /home/ubuntu/root/JDBC_Practice/lib/mysql-connector-j-8.2.0.jar
Driver name = com.mysql.cj.jdbc.Driver