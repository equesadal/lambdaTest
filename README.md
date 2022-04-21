# lambdaTest
Java coding exercise for Shopchat team.

# About the solution
As a facade for accessing the functionality, Spring Boot was used to expose a POST endpoint in http://localhost:8080/lambdatest
A very simple folder structure is used:
- Controllers: here you can find the LambdaTestController class, the one that received the request and then consumes the services for IsOdd, IsPrime and IsPalindromo.
- Process: a set of classes containing the logic (and the methods returning lambda expressions) to solve the code challenge.

# Components in the process logic
- OperationResolver: based on the type of operation, it invokes the specific operation using the value to process as a parameter.
- IsOddOperation: its responsability is only calculate if the provided number is odd (or even).
- IsPrimeOperation: same approach.
- IsPalindromeOperation: same approach.
- OperationInputParser: it takes the input (typically injected using the body request) and parser it to translate it to OperationInput class.

# Tech Debt
More guard clauses should be used to avoid edge scenarios, as this is an exercise, I didnt take extra care about it.

h3. How to run the code
From a command line run the following command: mvnw spring-boot:run
