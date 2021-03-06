package no.kristiania.httpclientdemo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuerryStringTest {
    @Test
    void shouldRetrieveQueryParameter() {
        QuerryString querryString = new QuerryString("status=200");
        assertEquals("200", querryString.getParameter("status"));
    }

    @Test
    void shouldRetrieveOtherQueryParameter() {
        QuerryString querryString = new QuerryString("status=404");
        assertEquals("404", querryString.getParameter("status"));

    }

    @Test
    void shouldRetrieveParameterByName() {
        QuerryString querryString = new QuerryString("text=Hello");
        assertEquals(null, querryString.getParameter("status"));
        assertEquals("Hello", querryString.getParameter("text"));

    }

    @Test
    void shouldHandleMultipleParameters() {
        QuerryString querryString = new QuerryString("text=Hello&status=200");
        assertEquals("200", querryString.getParameter("status"));
        assertEquals("Hello", querryString.getParameter("text"));
    }
}