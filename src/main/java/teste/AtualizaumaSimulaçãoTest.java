package teste;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.junit.Test;


public class AtualizaumaSimulaçãoTest {

    @Test
    public void AtualizarCpfTest() {
        given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"nome\": \"Fulano de Tal\",\n" +
                        "  \"cpf\": 97093236014,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .when()
                .put("http://localhost:8080/api/v1/simulacoes/2471764703")
                .then()
                .log().all()
                .statusCode(404);


    }

    @Test
    public void AtualizarCp01fTest() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Fulano de Tal\",\n" +
                        "  \"cpf\": 97093236014,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("http://localhost:8080/api/v1/simulacoes/97093236014")
                .then()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void AtualizarCp02fTest() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Fulano de Tal\",\n" +
                        "  \"cpf\":45093236093 ,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("http://localhost:8080/api/v1/simulacoes/45093236093")
                .then()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void Atualizar03Cp02fTest() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Fulano de Tal\",\n" +
                        "  \"cpf\":34093236093 ,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("http://localhost:8080/api/v1/simulacoes/34093236093")
                .then()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void Atualizar04Cp02fTest() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Fulano d Tal\",\n" +
                        "  \"cpf\":34093236093 ,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put("http://localhost:8080/api/v1/simulacoes/34093236093")
                .then()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void Atualizar05Cp02fTest() {
        given()
                .body("{\n" +
                        "  \"nome\": \"Fulano d Tal\",\n" +
                        "  \"cpf\":34093236093,\n" +
                        "  \"email\": \"email@email.com\",\n" +
                        "  \"valor\": 1200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
        .when()
                .put("http://localhost:8080/api/v1/simulacoes/34093236093")
        .then()
                .statusCode(200)
                .log().all();


    }
}