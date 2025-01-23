**Docker commands:**

Install docker desktop and make sure engine is running

`docker run -d -v C:\Users\Manohar_Mittapally\Documents\freecodecamp\projects\data\pgdata:\var\lib\postgresql\data -e POSTGRES_USERNAME=postgres -e POSTGRES_PASSWORD=manohar -p 5432:5432 postgres`

`docker run -d -v C:\Users\Manohar_Mittapally\Documents\freecodecamp\projects\data\pgdata:\var\lib\mysql\data -e MYSQL_ROOT_PASSWORD=manohar -p 3306:3306 mysql`