/*
 * package com.task.java.controller;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * 
 * import org.junit.Test;
 * 
 * import org.junit.runner.RunWith; import org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.RequestBuilder; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
 * 
 * import com.task.java.model.UserModel; import com.task.java.pojo.UserPojo;
 * import com.task.java.service.UserService;
 * 
 * import org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.MediaType; import
 * org.springframework.mock.web.MockHttpServletResponse;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest(value = JwtAuthenticationController.class) public class
 * JwtAuthenticationControllerTests {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @MockBean private UserService userService;
 * 
 * UserModel mockUser = new UserModel(1, "ramesh",
 * "pwd1",103,"12-08-2013","12-03-2012","true","19-02-2012 12:41");
 * 
 * String exampleUserJson =
 * "{\"username\":\"ramesh\",\"password\":\"pwd1\",\"roleid\":\"103\",\"createdDate\":\"12-08-2013\",\"updatedDate\":\"12-03-2012\",\"active\":\"true\",\"last_login\":\"19-02-2012 12:41\"}"
 * ;
 * 
 * @Test public void createUser() throws Exception { UserModel user = new
 * UserModel(1, "ramesh",
 * "pwd1",103,"12-08-2013","12-03-2012","true","19-02-2012 12:41");
 * 
 * // studentService.addCourse to respond back with mockCourse
 * Mockito.when(userService.saveUser(Mockito.any(UserPojo.class))).thenReturn(
 * mockUser);
 * 
 * // Send course as body to /students/Student1/courses RequestBuilder
 * requestBuilder = MockMvcRequestBuilders.post("/register")
 * .accept(MediaType.APPLICATION_JSON).content(exampleUserJson)
 * .contentType(MediaType.APPLICATION_JSON);
 * 
 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 * 
 * MockHttpServletResponse response = result.getResponse();
 * 
 * assertEquals(HttpStatus.CREATED.value(), response.getStatus());
 * 
 * assertEquals("http://localhost/register",
 * response.getHeader(HttpHeaders.LOCATION));
 * 
 * 
 * }
 * 
 * }
 */