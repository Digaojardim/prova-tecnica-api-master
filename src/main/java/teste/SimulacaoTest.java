package teste;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SimulacaoTest {
    @Test
    public void  testDadoQueConsultoTodosUsuariosQuandoPreenchoAsInformacoesEntaoValidoStatusCode201() {
     // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

    // Retorna todas as simulações existentes
    given().when().get("http://localhost:8080/api/v1/simulacoes").then().log().all();


    }
}
