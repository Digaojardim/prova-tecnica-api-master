package teste;
import static io.restassured.RestAssured.*;
import org.junit.Test;

public class RestriçãoTest {

    @Test
    public void Consultaumarestrição() {
        given().when().get("http://localhost:8080/api/v1/restricoes/97093236014").then().log().all();

    }

    @Test
    public void Consultaumarestrição01() {
        given().when().get("http://localhost:8080/api/v1/restricoes/60094146012").then().log().all();


    }

    @Test
    public void Consultaumarestrição02() {
        given().when().get("http://localhost:8080/api/v1/restricoes/84809766080").then().log().all();


    }

    @Test
    public void Consultaumarestrição03() {
        given().when().get("http://localhost:8080/api/v1/restricoes/62648716050").then().log().all();

    }

    @Test
    public void Consultaumarestrição04() {
        given().when().get("http://localhost:8080/api/v1/restricoes/26276298085").then().log().all();

    }

    @Test
    public void Consultaumarestrição05() {
        given().when().get("http://localhost:8080/api/v1/restricoes/01317496094").then().log().all();

    }

    @Test
    public void Consultaumarestrição06() {
        given().when().get("http://localhost:8080/api/v1/restricoes/55856777050").then().log().all();

    }

    @Test
    public void Consultaumarestrição07() {
        given().when().get("http://localhost:8080/api/v1/restricoes/19626829001").then().log().all();

    }

    @Test
    public void Consultaumarestrição08() {
        given().when().get("http://localhost:8080/api/v1/restricoes/24094592008").then().log().all();

    }

    @Test
    public void Consultaumarestrição09() {
        given().when().get("http://localhost:8080/api/v1/restricoes/58063164083").then().log().all();

    }

}

