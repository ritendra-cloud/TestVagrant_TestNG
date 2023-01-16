# TestVagrant_TestNG
Team and Player Management Project

This project is a simple Java program that uses JSON to represent a team and its players. The project includes the following classes:

Team
Player
TeamTest (unit tests)
Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites
You will need to have Java and Maven installed on your machine in order to run this program.

Built With
Java - The programming language used
Maven - Dependency Management
Jackson - JSON parsing library
TestNG - Testing framework


This project is a sample implementation of a team and player management system. The project includes two main classes, Team and Player, which are used to represent a team and its players respectively.

The Team class has the following properties:

name: the name of the team
location: the location of the team
players: a list of Player objects representing the players in the team
The Player class has the following properties:

name: the name of the player
country: the country of the player
role: the role of the player in the team (e.g. batsman, bowler)
priceInCrores: the price of the player in crores
The Team class also includes a method getForeignPlayerCount() which returns the number of foreign players in the team.

The project also includes a test class TeamTest which has test cases for the getForeignPlayerCount() method and a test case to check if there is a wicket-keeper in the team.

To run the tests, use the TestNG framework.
