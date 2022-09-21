package br.com.juliodelima.tests;
import br.com.juliodelima.pages.HomePage;
import br.com.juliodelima.pages.RegistroPage;
import br.com.juliodelima.pages.SecretaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@DisplayName("Testes Automatizados da Funcionalidade de SigUp")
public class SignUpTests {

    private WebDriver navegador;

    @BeforeEach
    public void setUp() {
        // Vou abrir o chrome
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @Test
    @DisplayName("Registar um nome usário com dados válidos")
    public void testRegistrarUmNovoUsauarioComDadosValidos() {

        String saudacaoAtual = new HomePage(navegador)
                .acessarpaginaDoTaskit()
                .abrirPaginaDeRegistro()
                .registrarNovoUsuario("Marco", "Marco00034", "123456")
                .pegarASaudacao();

        Assertions.assertEquals("Hi, Marco", saudacaoAtual);

    }

    @AfterEach
    public void tearDown() {
        navegador.quit();
    }
}

