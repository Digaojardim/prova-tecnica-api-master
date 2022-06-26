package teste;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;


public class NovaSimulacaoTest {
    @Test
    public void Insereumanovasimulação() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Froripa\",\n" +
                        "  \"cpf\":84093236077,\n" +
                        "  \"email\": \"fro@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .statusCode(201)
                .log().all();

    }

    @Test
    public void Insereumanovasimulação01() {
        given()
                .body("{\n" +
                        "  \"nome\": \"gugu\",\n" +
                        "  \"cpf\":3409323607,\n" +
                        "  \"email\": \"gu@email.com\",\n" +
                        "  \"valor\": 3300,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .statusCode(201)
                .log().all();

    }

    @Test
    public void Insereumanovasimulação02() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Rafael\",\n" +
                        "  \"cpf\":5609323607,\n" +
                        "  \"email\": \"fael@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .statusCode(201)
                .log().all();

    }

    @Test
    public void Insereumanovasimulação03() {
        given()
                .body("{\n" +
                        "  \"nome\": \"\",\n" +
                        "  \"cpf\":,\n" +
                        "  \"email\": \"fael@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .statusCode(400)
                .log().all();

    }
    @Test
    public void Insereumanovasimulação005() {
        given()
                .body("{\n" +
                        "  \"nome\": \"vania\",\n" +
                        "  \"cpf\":77093236077,\n" +
                        "  \"email\": \"vani@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .statusCode(201)
                .log().all();


    }
}