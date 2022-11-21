package examples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTest {

  @Autowired
  private FromValueAnnotation fromValueAnnotation;

  @Autowired
  private FromProperties fromProperties;

  @Autowired
  private FromWiredBean fromWiredBean;

  @Test
  void fromValueAnnotation() {
    assertThat(fromValueAnnotation.getValue1()).isEqualTo("Message 1 from .env");
    assertThat(fromValueAnnotation.getValue2()).isEqualTo("Message 2 from system environment");
    assertThat(fromValueAnnotation.getValue3()).isEqualTo("Message 3 from system environment");
    assertThat(fromValueAnnotation.getValue1v2()).isEqualTo("Message 1 from .env");
    assertThat(fromValueAnnotation.getValue2v2()).isEqualTo("Message 2 from system environment");
    assertThat(fromValueAnnotation.getValue3v2()).isEqualTo("Message 3 from system environment");
  }

  @Test
  void fromProperties() {
    assertThat(fromProperties.getValue1()).isEqualTo("Message 1 from .env");
    assertThat(fromProperties.getValue2()).isEqualTo("Message 2 from system environment");
    assertThat(fromProperties.getValue3()).isEqualTo("Message 3 from system environment");
  }

  @Test
  void fromWiredBean() {
    assertThat(fromWiredBean.getValue1()).isEqualTo("Message 1 from .env");
    assertThat(fromWiredBean.getValue2()).isEqualTo("Message 2 from system environment");
    assertThat(fromWiredBean.getValue3()).isEqualTo("Message 3 from system environment");
  }
}
