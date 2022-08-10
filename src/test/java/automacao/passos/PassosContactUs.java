package automacao.passos;

import automacao.core.Core;
import automacao.paginas.ContacUs;
import automacao.paginas.Tshirt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PassosContactUs extends Core {

    private ContacUs paginacontactus;

    public PassosContactUs() {
        paginacontactus = new ContacUs();
        PageFactory.initElements(driver, this.paginacontactus);

    }

    @Given("Clica em Contact us")
    public void clica_em_contact_us() {
        clicar(paginacontactus.getMenuContactUs());
    }

    @Given("Seleciona a opcão Custumer Service")
    public void seleciona_a_opcao_custumer_service() {
        selecionaCampoSelect(paginacontactus.getSelectContact(),"id_contact", 1);
    }

    @Given("^Digitar o \"([^\"]*)\" no campo email address$")
    public void digitar_o_email_no_campo_email_address(String email) {
        digitarCampo(paginacontactus.getEmail(), email);

    }

    @Given("^Digitar \"([^\"]*)\" no campo order reference$")
    public void digitar_testing_no_campo_order_reference(String orderReference) {
        digitarCampo(paginacontactus.getOrderReference(), orderReference);
    }

    @Given("^Digitar \"([^\"]*)\" no campo message$")
    public void digitar_no_campo_message(String message) {
        digitarCampo(paginacontactus.getMessage(), message);
    }

    @When("Clico no botão send")
    public void clico_no_botao_send() {
        clicar(paginacontactus.getButtonSend());

    }

    @Then("^Deverá mostrar a \"([^\"]*)\"$")
    public void devera_mostrar_a_mensagem_de_sucesso(String messageSuccess) {
        validarCampoGetText(paginacontactus.getValidarFormulario(), messageSuccess);

    }
}


