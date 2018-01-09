/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.jersey.api.client.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;

public class ResData {
    
    public static Tblproduct findbyid(Tblproduct b) {
        Tblproduct bb = new Tblproduct();
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/exam_ws/webresources/app.tblproduct/" + b.getId());
        ClientResponse response = (ClientResponse) webResource
                .accept(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .get(ClientResponse.class);
        String entity = response.getEntity(String.class);
        JsonObject jsonObject = new Gson().fromJson(entity, JsonObject.class);
        bb.setId(jsonObject.get("id").getAsInt());
        bb.setName(jsonObject.get("name").getAsString());
        bb.setPrice(jsonObject.get("price").getAsDouble());
        bb.setQuantity(jsonObject.get("quantity").getAsInt());
        System.out.println(response.getStatus());
        return bb;
    }

    public static void put(Tblproduct b) {
        System.out.println(b.toString()+b.getId());
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/exam_ws/webresources/app.tblproduct/" + b.getId());
        ClientResponse response = (ClientResponse) webResource
                .accept(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .put(ClientResponse.class,parseBookToJson(b));
        System.out.println(response.getStatus());
    }

    public static void delete(Tblproduct b) {
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/exam_ws/webresources/app.tblproduct/" + b.getId());
        ClientResponse response = (ClientResponse) webResource
                .accept(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .delete(ClientResponse.class);
        System.out.println(response.getStatus());
    }

    public static void create(Tblproduct b) {
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/exam_ws/webresources/app.tblproduct");
        ClientResponse response = (ClientResponse) webResource
                .accept(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .post(ClientResponse.class, b.toString());
        if (response.getStatus() == 204) {

        }
        System.out.println(response.getStatus());
    }

    public static List<Tblproduct> findall() {
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/exam_ws/webresources/app.tblproduct");
        ClientResponse response = (ClientResponse) webResource
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        String entity = response.getEntity(String.class);
        List<Tblproduct> bookses = parseListBookses(entity);
        return bookses;
    }

    public static List<Tblproduct> findallname(String name) {
        List<Tblproduct> bookses = findall();
        List<Tblproduct> bookres = new ArrayList<>();
        for (Tblproduct book : bookses) {
            if (book.getName().contains(name)) {
                bookres.add(book);
            }
        }
        return bookres;
    }

    public static String parseBookToJson(Tblproduct b) {
        String toJson = new Gson().toJson(b);
        return toJson;
    }

    public static List<Tblproduct> parseListBookses(String json) {
        List<Tblproduct> bookses = new ArrayList<>();
        JsonArray fromJson = new Gson().fromJson(json, JsonArray.class);
        for (JsonElement jsonElement : fromJson) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            Tblproduct b = new Tblproduct();
            b.setId(jsonObject.get("id").getAsInt());
            b.setName(jsonObject.get("name").getAsString());
            b.setPrice(jsonObject.get("price").getAsDouble());
            b.setQuantity(jsonObject.get("quantity").getAsInt());
            bookses.add(b);
        }
        return bookses;
    }

}
