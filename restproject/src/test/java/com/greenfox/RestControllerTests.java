package com.greenfox;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTests {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doubleNumber_succesfull() throws Exception {
        mockMvc.perform(get("/doubling?input=15")
        )  .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void doubleNumber_missingInput()throws Exception {
        mockMvc.perform (get("/doubling")
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.error",is("Please provide an input!")));
    }

    @Test
    public void greeting_succesfull() throws Exception {
        mockMvc.perform(get("/greeter?name=Iv&title=student"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Iv, my dear student!")));
    }

    @Test
    public void greeting_missingName() throws Exception {
        mockMvc.perform(get("/greeter?title=student"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void appending_succesfull() throws Exception {
        mockMvc.perform(get("/appenda/iv"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended", is("iva")));
    }

    





}
