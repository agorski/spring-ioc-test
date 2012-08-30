package de.ago.test.spring.ioc;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

@ContextConfiguration(locations = {"classpath:context.xml"})
public class ZaleznyTest extends AbstractTestNGSpringContextTests {

  private static Logger logger = Logger.getLogger(ZaleznyTest.class);

  @Autowired
  private Zalezny zalezny;

  @Test
  public void sprawdzZaleznosci() {
    assertNotNull(zalezny);
    assertNotNull(zalezny.getWstrzykiwana());
    assertNotNull(zalezny.getOpis());
    assertNotNull(zalezny.getPierwszeSlonce());
    logger.debug("opis "+zalezny.getOpis());
  }
}

