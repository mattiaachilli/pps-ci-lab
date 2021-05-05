import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlanScalaTest {
  @Test
  def testAlan: Unit = {
    val alan:AlanScala=new AlanScala(new Alan())
    assertEquals("CIAO",alan.getter())
  }
}
