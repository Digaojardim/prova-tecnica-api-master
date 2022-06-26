package teste;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class DeletarSimulacaoTest {
    @Test
    public void testDadoQueDeletoUmUsuarioQuandoPreenchoAsiInformacoesEntaoValidoStatusCode200(){
        given().

        when()
                .delete("http://localhost:8080/api/v1/simulacoes/5609323607")
        .then()
                .statusCode(200)
                 .log().all();





    }
}
