JWT GENERATION - SPRING BOOT PROJECT

REQUIREMENTS
- Java 17 or later
- Spring Tools 4 / Spring Tool Suite
- Internet connection for the first Maven dependency download

IMPORT INTO SPRING TOOLS
1. Extract JWTGeneration.zip.
2. Open Spring Tools.
3. Select File > Import.
4. Select Maven > Existing Maven Projects, then click Next.
5. Browse to the extracted JWTGeneration folder.
6. Select the pom.xml project and click Finish.
7. Wait for Maven to download dependencies. If needed, right-click project >
   Maven > Update Project > OK.

RUN
1. Expand src/main/java > com.example.demo.
2. Right-click JwtGenerationApplication.java.
3. Select Run As > Spring Boot App.
4. Wait for "Started JwtGenerationApplication" in the Console.

TEST IN SWAGGER
1. Open http://localhost:8080/swagger-ui/index.html
2. Expand POST /api/jwt/generate.
3. Click Try it out.
4. Enter:
   {
     "username": "Tejaswini",
     "role": "ADMIN"
   }
5. Click Execute.
6. A signed JWT string should appear in the Response body.

API
POST http://localhost:8080/api/jwt/generate
Content-Type: application/json

The token expires after one hour. The secret in JwtUtil.java is for lab
demonstration only. A real application must authenticate the user first and
must keep its signing secret outside source code.
