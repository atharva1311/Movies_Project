# Movie Management System

## Project Overview

This project is a Movie Management System that stores and manages movies year-wise. It uses collections like HashMap and ArrayList to organize movie data. The system allows you to add movies with their cast details, remove movies, and retrieve movie information based on the year.

## Project Structure
The project is divided into five main packages:

1. entity: Contains the POJO class MovieCast with attributes like actorName, gender, and age.
2. dao: Contains the MoviesDao class, which manages data storage in a HashMap. The key is the year, and the value is another HashMap where the movie names are keys and the cast details are stored as a list.
3. service: Contains the business logic for managing movies, such as adding, removing, and fetching movies.
4. controller: Handles user requests by invoking methods from the service layer.
5. client: Contains the main method and a menu-driven interface for interacting with the system.

## Features
1. Add movies by year.
2. Store cast details (actor name, gender, age) for each movie.
3. Retrieve movies based on year.
4. Remove movies.

## How to Run the Project
1. Clone the repository

```bash
 git clone https://github.com/atharva1311/Movies_Project
```
2. Navigate to the project directory:
```bash
cd movie-management-system
```
3. Open the project in your IDE.
4. Run the Client.java to start the system and interact with the menu-driven interface.

## Requirements
1. Java 8 or higher
2. IDE (Eclipse, IntelliJ, etc.)

## Example Usage
### Adding Movies Example:
```yaml
Enter the year: 2023
Enter the movie name: The Great Adventure
Enter number of actors: 2
Enter actor 1 name: John Doe
Enter actor 1 gender: Male
Enter actor 1 age: 35
Enter actor 2 name: Jane Smith
Enter actor 2 gender: Female
Enter actor 2 age: 29
Movie added successfully!
```
### Remove a Movie:
```yaml
Enter the movie name to remove: Hidden Realities
Movie removed successfully.
```
### Retrieve Movies Based on Year:
```yaml
Enter the year: 
2023
 --------------------------------
| Name of Movies                 |
 --------------------------------
| Animal                         |
| Gadar 2                        |
| Jawan                          |
| Leo                            |
| Pathan                         |
| Salaar                         |
 ---------------------------------
```






