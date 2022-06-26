package teste;

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
                        "  \"cpf\": 97093236091,\n" +
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
                        "  \"cpf\": 47093236077,\n" +
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
                        "  \"cpf\": 45093236078,\n" +
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
                        "  \"cpf\": 34093236009,\n" +
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
                        "  \"cpf\": 83493236045,\n" +
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

    @Test
    public void testDadoQueCadastroUsuario06QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"gabi\",\n" +
                        "  \"cpf\": 88093236000,\n" +
                        "  \"email\": \"gabi@email.com\",\n" +
                        "  \"valor\": 9200,\n" +
                        "  \"parcelas\": 2,\n" +
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
    public void testDadoQueCadastroUsuario07QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\\n\" +\n" +
                        "                        \"  \\\"nome\\\": \\\"gabi\\\",\\n\" +\n" +
                        "                        \"  \\\"cpf\\\": 88093236099,\\n\" +\n" +
                        "                        \"  \\\"email\\\": \\\"gabi@email.com\\\",\\n\" +\n" +
                        "                        \"  \\\"valor\\\": 9200,\\n\" +\n" +
                        "                        \"  \\\"parcelas\\\": 2,\\n\" +\n" +
                        "                        \"  \\\"seguro\\\": true\\n\" +\n" +
                        "                        \"}")
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/simulacoes")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);


    }

    @Test
    public void testDadoQueCadastroUsuario08QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"Ezequias\",\n" +
                        "  \"cpf\": 11093236011,\n" +
                        "  \"email\": \"zequias@email.com\",\n" +
                        "  \"valor\": 6200,\n" +
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
    public void testDadoQueCadastroUsuario09QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Cadastrar usuario
        given()
                .body("{\n" +
                        "  \"nome\": \"Sandro\",\n" +
                        "  \"cpf\": 66093236003,\n" +
                        "  \"email\": \"sadro@email.com\",\n" +
                        "  \"valor\": 7800,\n" +
                        "  \"parcelas\": 2,\n" +
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