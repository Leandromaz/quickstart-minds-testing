package automacao.paginas;

import automacao.core.Core;
import org.openqa.selenium.By;

public class CreateAnAccount extends Core {

    public By getSign() {
        return getByCss("a[class='login']");
    }

    public By getEmailCriarConta() {

        return getById("email_create");
    }

    public By getBotaoCreateAnAccount() {

        return getById("SubmitCreate");

    }

    public By getBotaoRadioOne() {

        return getById("id_gender1");

    }

    public By getCampoPrimeiroNome() {

        return getById("customer_firstname");

    }

    public By getCampoUltimoNome() {

        return getById("customer_lastname");

    }

    public By getEmailOne() {

        return getById("email");

    }

    public By getPassword() {

        return getById("passwd");

    }

    public By getDayBday() {

        return getById("uniform-days");

    }

    public By getMonthyBday() {

        return getById("uniform-months");

    }

    public By getYearsBday() {

        return getById("uniform-years");

    }

    public By getPrimeiroNome() {

        return getById("firstname");

    }

    public By getUltimoNome() {

        return getById("lastname");

    }

    public By getCompany() {

        return getById("company");

    }

    public By getAddressone() {

        return getById("address1");

    }

    public By getComplemento() {

        return getById("address2");

    }

    public By getCidade() {

        return getById("city");

    }

    public By getState() {

        return getById("uniform-id_state");

    }
    public By getZipCode() {

        return getById("postcode");

    }
    public By getPais() {

        return getById("uniform-id_country");

    }
    public By getInformacaoAdicional() {

        return getById("other");

    }
    public By getHomePhone() {

        return getById("phone");

    }
    public By getPhoneMobile() {

        return getById("phone_mobile");

    }
    public By getMyAdress() {

        return getById("alias");

    }
    public By getButtonRegister() {

        return getById("submitAccount");

    }
    public By getMessage() {

        return getByClassName("info-account");

    }

}
