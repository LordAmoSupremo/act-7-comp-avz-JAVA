package tagpersonalizados;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import jakarta.servlet.jsp.JspException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VacioHandler extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
  
        String fullName = "David Eduardo Pérez Luna";

        // Obtener la fecha actual
        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        // Mostrar el nombre completo y la fecha actual
        getJspContext().getOut().write("Nombre completo: " + fullName + "<br/>");
        getJspContext().getOut().write("Fecha actual: " + currentDate);
    }
}
