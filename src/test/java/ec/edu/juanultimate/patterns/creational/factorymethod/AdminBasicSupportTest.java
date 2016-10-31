package ec.edu.juanultimate.patterns.creational.factorymethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AdminBasicSupportTest {

    @Test
    public void shouldReturnSLA(){
        AdminBasicSupport support = new AdminBasicSupport();
        assertThat(support.getSLA(),is(40));
    }

    @Test
    public void shouldReturnAllowedTickets(){
        AdminBasicSupport support = new AdminBasicSupport();
        assertThat(support.getAllowedTickets(),is(9999));
    }
}
