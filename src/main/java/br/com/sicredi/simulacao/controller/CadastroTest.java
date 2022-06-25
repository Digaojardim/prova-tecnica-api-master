package br.com.sicredi.simulacao.controller;

import antlr.build.Tool;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CadastroTest {
    @Test
    public void testDadoQueCadastroUsuarioQuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"papito\",\n" +
                        "  \"cpf\": 97093236093,\n" +
                        "  \"email\": \"papito@email.com\",\n" +
                        "  \"valor\": 7200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);


    }

    @Test
    public void testDadoQueCadastroUsuario01QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"joao\",\n" +
                        "  \"cpf\": 47093236093,\n" +
                        "  \"email\": \"papito@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);


    }

    @Test
    public void testDadoQueCadastroUsuario02QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"Pedro\",\n" +
                        "  \"cpf\": 45093236093,\n" +
                        "  \"email\": \"pedro@email.com\",\n" +
                        "  \"valor\": 8200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);

    }

    @Test
    public void testDadoQueCadastroUsuario04QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"Gabril\",\n" +
                        "  \"cpf\": 34093236093,\n" +
                        "  \"email\": \"biel@email.com\",\n" +
                        "  \"valor\": 6700,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);

    }

    @Test
    public void testDadoQueCadastroUsuario05QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"Araujo\",\n" +
                        "  \"cpf\": 83493236093,\n" +
                        "  \"email\": \"araujo@email.com\",\n" +
                        "  \"valor\": 7200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);

    }
}

