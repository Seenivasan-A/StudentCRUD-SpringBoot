# StudentCRUD-SpringBoot

| Name                | Description                                                                                                                                                           |
| ------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `.mvn/wrapper`      | Maven Wrapper scripts and JARs used for building the project even if Maven is not installed globally.                                                                 |
| `src`               | Contains your **Java source code** and **Spring Boot application logic**. This is where your `controller`, `service`, `repository`, and `entity` classes are located. |
| `.DS_Store`         | Mac OS system file (can be deleted). It stores folder view settings and is not needed in your project.                                                                |
| `.gitattributes`    | Git settings for handling line endings and merge rules. Optional.                                                                                                     |
| `.gitignore`        | Tells Git which files/folders to ignore (e.g., IDE files, `target/`, `.class` files).                                                                                 |
| `README.md`         | Markdown file where you describe the project purpose, how to run it, etc. Displayed on the repo homepage.                                                             |
| `mvnw` & `mvnw.cmd` | Shell/batch scripts to run Maven commands without installing Maven globally.                                                                                          |
| `pom.xml`           | The Maven configuration file where you define project dependencies, plugins, Java version, etc.                                                                       |


Postman
http://localhost:8085/students -Getall Students
http://localhost:8085/students/rno -Get Students by Id
http://localhost:8085/students/rno -Delete Students by Id
http://localhost:8085/students -Post New Students
http://localhost:8085/students/rno -Update by Id
