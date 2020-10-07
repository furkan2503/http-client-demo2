package no.kristiania.httpclientdemo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientTest {

    @Test
    void shouldReadSuccessStatusCode() {
        HttpClient httpClient = new HttpClient("urlecho.appspot.com", 80, "/echo?status=200");
        assertEquals(200, httpClient.getResponceCode());
    }

    @Test
    void shouldReadFailureStatusCode() {
        HttpClient httpClient = new HttpClient("urlecho.appspot.com", 80, "/echo?status=401");
        assertEquals(401, httpClient.getResponceCode());
    }


}