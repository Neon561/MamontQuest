package Server;

import Library.Response;

public class App {
    public static void main(String[] args) {
    Response response = new Response();
    response.setPayload("Qwerty");
        System.out.println(response);
    }

}
