import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
import static io.restassured.path.json.JsonPath.from;

/**
 * Created by Sergey
 */

public class usersTest {


    @DisplayName("Первый тест")
    @Description("Опять тест")
    @Test
    
 //   @Step("Запуск теста")
   // @Attachment
    public void submitForm() {
        //дано
        body();


    }
@Step("Тест")
    private void body() {

        given()
                //тело
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                //заголовок
                .header("Content-Type", "application/json")             //отправь сюда запрос
                .post("https://reqres.in/api/login")
                //тогда статус 200 и залогируй
                .then().statusCode(200).log().all();

    }

    @DisplayName("Первый тест")
    @Description("Опять тест")
    @Test
    @Step("Запуск теста")
    public void submitForm4(){
        //дано
        //    JSONObject jsonAsMap = new JSONObject();
        HashMap<String, Object> jsonAsMap = new HashMap<String, Object>();
        //  JSONObject person = new JSONObject();
        jsonAsMap.put("email", "eve.holt@reqres.in");
        jsonAsMap.put("password", "cityslicka");
        given().when().log().all()
                .contentType("application/json")
                .body(JSONObject.toJSONString(jsonAsMap))
                .post("https://reqres.in/api/login")
                .then()
                .log().all();

    }


    @Test
    public void submitForm3() {
        //дано
        given()
                //тело
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}").log().all()
                //заголовок
                .header("Content-Type", "application/json")
                //отправь сюда запрос
                .get("https://reqres.in/api/login")
                //тогда статус 200 и залогируй
                .then().statusCode(200).log().all();

    }


    @Test
    public void submitForm2() {
        //дано
//        given()
//                //тело
//                .header("Content-Type", "application/json")             //отправь сюда запрос
//                .post("https://reqres.in/api/users?page=2")
//                //тогда статус 200 и залогируй
//                .then().statusCode(201).log().all();

        Response response =
                given()
                        .log().all()
                        .header("Content-Type", "application/json")             //отправь сюда запрос
                        .when().get("https://reqres.in/api/users?page=2");


        String xmlResponse = response.getBody().asString();
        System.out.println(xmlResponse);
        //  List<String> bookTitles = from(xmlResponse).getList("data.findAll { it.id == 4 }.first_name");
        //   System.out.println(bookTitles);
    }


}
