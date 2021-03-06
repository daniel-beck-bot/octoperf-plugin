package org.jenkinsci.plugins.octoperf.report;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link BenchReport}.
 * 
 * @author jerome
 *
 */
public class BenchReportJacksonTest {
  
  private final ObjectMapper mapper = new ObjectMapper();
  
  @Test
  public void shouldJacksonSerializeCorrectly() throws IOException {
    final BenchReport dto = BenchReportTest.newInstance();
    
    final String json = mapper.writeValueAsString(dto);
    final BenchReport fromJson = mapper.readValue(json, BenchReport.class);
    assertEquals(dto, fromJson);
  }
}
