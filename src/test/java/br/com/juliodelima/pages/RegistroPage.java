package br.com.juliodelima.pages;

import br.com.juliodelima.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends BasePage {

    @FindBy(id = "name-sign-up")
    private WebElement campoNome;

    @FindBy(id = "login-sign-up")
    private WebElement campoLogin;

    @FindBy(id = "password-sign-up")
    private WebElement campoSenha;

    @FindBy(id = "btn-submit-sign-up")
    private WebElement BotaoSalvar;

    public RegistroPage(WebDriver navegador) {
        super(navegador);
    }

    public SecretaPage registrarNovoUsuario(String nome, String login, String senha) {

        // Vou digitar o nome no campo com Id igual a name-sign-up
        campoNome.sendKeys(nome);

        // Vou digitar o login no campo com Id igual a login-sign-up
        campoLogin.sendKeys(login);

        // Vou digitar o password no campo id igual a password-sign-up
        campoSenha.sendKeys(senha);

        // Vopu clicar no botão com Id igual a btn-submit-sign-up
        BotaoSalvar.click();

        return new SecretaPage(navegador);
    }
}
