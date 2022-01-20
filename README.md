# Cinema-app 
It's an application that can organize the ordering of tickets to the cinema

## Application provides next opportunities:
- Register new user
- Authentication and authorization of users
- Other features which described at endpoints.

## List of endpoints which has an application depends on roles:
- POST: /register - all (create user with role USER)
- GET: /cinema-halls - USER/ADMIN (list of all cinema halls)
- POST: /cinema-halls - ADMIN (create new cinema hall)
- GET: /movies - USER/ADMIN (list of all movies)
- POST: /movies - ADMIN (create new movie)
- GET: /movie-sessions/available - USER/ADMIN (list of all movie-sessions for current user)
- GET: /movie-sessions/{id} - USER/ADMIN (specific movie-session by id)
- POST: /movie-sessions - ADMIN (create new movie-session)
- PUT: /movie-sessions/{id} - ADMIN (update movie-session by id)
- DELETE: /movie-sessions/{id} - ADMIN (delete movie-session)
- GET: /orders - USER (list of orders for current user)
- POST: /orders/complete - USER (create order from shopping cart for current user)
- PUT: /shopping-carts/movie-sessions - USER (add movie-session to shopping cart for current user)
- GET: /shopping-carts/by-user - USER (shopping cart for current user)
- GET: /users/by-email - ADMIN (get info about user by e-mail)

All requests except _GET_ you can send from _Postman_ in JSON format. All responses are also in JSON format.

Examples of requests:
- POST: /register : {"email": "user@i.ua", "password":"12345678", "repeatPassword":"12345678"}
- POST: /cinema-halls : {"capacity":100, "description":"red"}; 
- POST: /movies : {"title":"The fast and furious", "description":"about cars"}
- GET: /movie-sessions/available : /movie-sessions/available?movieId=1&date=11.11.2020
- POST: /movie-sessions : {"movieId":1, "cinemaHallId":1, "showTime":"11.11.2020 15:00"}
- PUT: /movie-sessions/{id} : {"movieId":1, "cinemaHallId":1, "showTime":"11.11.2020 10:00"}
- PUT: /shopping-carts/movie-sessions : /shopping-carts/movie-sessions?movieSessionId={id}

## There are technologies that were used:
- Java 11
- Hibernate
- MySQL 8.0.27
- Spring (Core, Web, Security)
- Maven

## Required steps before starting the application:
1. Install and configure Tomcat webserver.
2. Install MySQL and MySQL workbench. Create Schema.
3. Fulfill database connection properties at _/resources/db.properties_;
4. Fork project from GitHub.
5. You can start an application
    By default, you will be redirected to the /login endpoint.
    In the beginning, you have one user with access role _ADMIN_ with e-mail: _admin@i.ua_ and password _admin1234_
    You can create any amount of users with role _USER_